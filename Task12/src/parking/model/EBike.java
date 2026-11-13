package parking.model;
public class EBike extends Vehicle {
    public EBike(String regNo) { super(regNo); }
    @Override public double hourlyRate() { return 8.0; }
    public double flatParkingFee() { return 20.0; }
}
