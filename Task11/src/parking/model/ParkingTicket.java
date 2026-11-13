package parking.model;

import java.time.LocalDateTime;

public class ParkingTicket {
    private static int nextTicketNumber = 1000;
    private final String ticketNumber;
    private final Vehicle vehicle;
    private final int floor;
    private final int slot;
    private final LocalDateTime entryTime;

    public ParkingTicket(Vehicle vehicle, int floor, int slot) {
        this.ticketNumber = "PK" + (++nextTicketNumber);
        this.vehicle = vehicle;
        this.floor = floor;
        this.slot = slot;
        this.entryTime = LocalDateTime.now();
    }

    public String getTicketNumber() { return ticketNumber; }
    public Vehicle getVehicle() { return vehicle; }
    public int getFloor() { return floor; }
    public int getSlot() { return slot; }
    public LocalDateTime getEntryTime() { return entryTime; }
}
