package parking.app;

import parking.model.*;
import parking.service.ParkingFacility;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Five floors with different capacities.
        ParkingFacility facility = new ParkingFacility(new int[]{3, 4, 2, 5, 1});

        ParkingTicket ebikeTicket = facility.enter(new EBike("TN10EB1234"));
        ParkingTicket vanTicket = facility.enter(new DeliveryVan("TN20DV5678"));
        ParkingTicket carTicket = facility.enter(new Car("TN30CA9012"));

        System.out.println("E-bike ticket: " + ebikeTicket.getTicketNumber());
        System.out.println("Delivery van ticket: " + vanTicket.getTicketNumber());
        System.out.println("Car ticket: " + carTicket.getTicketNumber());

        System.out.println("E-bike fee: Rs " + facility.exit("TN10EB1234", null));
        System.out.println("Van fee: Rs " + facility.exit("TN20DV5678", null));
        System.out.println("Car fee with one-day pass: Rs " +
                facility.exit("TN30CA9012", new OneDayPass(LocalDate.now())));
    }
}
