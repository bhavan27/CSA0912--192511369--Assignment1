package parking.model;
import java.time.LocalTime;
public class DeliveryVan extends Vehicle {
    public DeliveryVan(String regNo) { super(regNo); }
    @Override public double hourlyRate() { return 30.0; }
    public double rateForEntryTime(LocalTime entryTime) {
        return (!entryTime.isBefore(LocalTime.of(9, 0)) &&
                entryTime.isBefore(LocalTime.of(17, 0))) ? hourlyRate() * 2 : hourlyRate();
    }
}
