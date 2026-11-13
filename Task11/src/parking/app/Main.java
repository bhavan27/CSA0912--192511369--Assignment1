package parking.app;

import parking.model.*;
import parking.service.ParkingFacility;

public class Main {
    public static void main(String[] args) {
        ParkingFacility facility = new ParkingFacility(new int[]{2, 3, 2});

        ParkingTicket t1 = facility.enter(new TwoWheeler("TN01AB1111"));
        ParkingTicket t2 = facility.enter(new Car("TN02CD2222"));
        ParkingTicket t3 = facility.enter(new ElectricCar("TN03EF3333"));

        System.out.println("Ticket: " + t1.getTicketNumber() + " | " +
                t1.getVehicle().getRegistrationNumber() + " | Floor " +
                t1.getFloor() + " Slot " + t1.getSlot());
        System.out.println("Ticket: " + t2.getTicketNumber() + " | " +
                t2.getVehicle().getRegistrationNumber());
        System.out.println("Ticket: " + t3.getTicketNumber() + " | " +
                t3.getVehicle().getRegistrationNumber());

        // The extra minutes make the demo fee deterministic enough to demonstrate billing.
        System.out.println("Exit fee for TN01AB1111: Rs " +
                facility.exit("TN01AB1111", 65));
        System.out.println("Vehicles still parked: " + facility.getActiveVehicleCount());
    }
}
