package parking.service;

import parking.model.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class ParkingFacility {
    private final String[][] slots;
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
            throw new IllegalStateException("This vehicle is already parked");
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

    public double exit(String registrationNumber, int additionalMinutes) {
        if (additionalMinutes < 0) throw new IllegalArgumentException("Negative minutes");
        String reg = registrationNumber.trim().toUpperCase();
        ParkingTicket ticket = activeTickets.remove(reg);
        if (ticket == null) throw new IllegalArgumentException("No active ticket for " + reg);

        LocalDateTime now = LocalDateTime.now();
        long elapsed = Duration.between(ticket.getEntryTime(), now).toMinutes() + additionalMinutes;
        int minutes = (int) Math.max(0, elapsed);
        int hours = (minutes + 59) / 60;
        double fee = hours * ticket.getVehicle().hourlyRate();
        if (ticket.getVehicle() instanceof ElectricCar) {
            // Demo charging amount: 0 kWh unless a separate charging transaction is recorded.
        }
        slots[ticket.getFloor()][ticket.getSlot()] = null;
        return fee;
    }

    public int getActiveVehicleCount() { return activeTickets.size(); }
    public int getFloorCount() { return slots.length; }
}
