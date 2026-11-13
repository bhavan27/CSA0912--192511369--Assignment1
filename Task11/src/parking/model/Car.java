package parking.model;
public class Car extends Vehicle {
    public Car(String regNo) { super(regNo); }
    @Override public double hourlyRate() { return 30.0; }
}
