package parking.model;
public class ElectricCar extends Car {
    public ElectricCar(String regNo) { super(regNo); }
    public double chargingFee(int kWh) {
        if (kWh < 0) throw new IllegalArgumentException("kWh cannot be negative");
        return kWh * 12.0;
    }
}
