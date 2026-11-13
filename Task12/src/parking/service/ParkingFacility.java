package parking.service;

import parking.model.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class ParkingFacility {
    private final String[][] slots; // jagged array supports unequal floor capacities
    private final Map<String, ParkingTicket> activeTickets = new HashMap<>();

    public ParkingFacility(int[] slotsPerFloor) {
        slots = new String[slotsPerFloor.length][];
        for (int i = 0; i < slotsPerFloor.length; i++) {
            if (slotsPerFloor[i] < 0) throw new IllegalArgumentException("Negative slot count");
            slots[i] = new String[slotsPerFloor[i]];
        }
    }

    public ParkingTicket enter(Vehicle vehicle) {
        String reg = vehicle.getRegistrationNumber();
        if (activeTickets.containsKey(reg))
            throw new IllegalStateException("Vehicle already parked");
        for (int f = 0; f < slots.length; f++) {
            for (int s = 0; s < slots[f].length; s++) {
                if (slots[f][s] == null) {
                    slots[f][s] = reg;
                    ParkingTicket ticket = new ParkingTicket(vehicle, f, s);
                    activeTickets.put(reg, ticket);
                    return ticket;
                }
            }
        }
        throw new IllegalStateException("Parking facility is full");
    }

    public double exit(String regNo, ParkingPass pass) {
        return exit(regNo, pass, 0);
    }

    // additionalMinutes makes fee-boundary tests reproducible.
    public double exit(String regNo, ParkingPass pass, int additionalMinutes) {
        if (additionalMinutes < 0) throw new IllegalArgumentException("Negative duration");
        String reg = regNo.trim().toUpperCase();
        ParkingTicket ticket = activeTickets.remove(reg);
        if (ticket == null) throw new IllegalArgumentException("No active ticket");

        int minutes = (int) Math.max(0,
                Duration.between(ticket.getEntryTime(), LocalDateTime.now()).toMinutes() + additionalMinutes);
        int hours = (minutes + 59) / 60;
        Vehicle vehicle = ticket.getVehicle();
        double fee;

        if (vehicle instanceof EBike ebike) {
            fee = ebike.flatParkingFee();
        } else if (vehicle instanceof DeliveryVan van) {
            fee = hours * van.rateForEntryTime(ticket.getEntryTime().toLocalTime());
        } else {
            fee = hours * vehicle.hourlyRate();
        }

        if (pass != null && pass.isValid()) fee = 0.0;
        slots[ticket.getFloor()][ticket.getSlot()] = null;
        return fee;
    }

    public int getActiveVehicleCount() { return activeTickets.size(); }
    public int getFloorCount() { return slots.length; }
}
