// A compact runnable example for constructors, this, static, inheritance,
// overriding, abstract classes, interfaces and encapsulation.

interface PassHolder {
    boolean hasValidPass();
}

abstract class DemoVehicle {
    private final String registrationNumber;
    private static int vehicleCount = 0;

    public DemoVehicle() {
        this("NOT-ASSIGNED");
    }

    public DemoVehicle(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isBlank()) {
            throw new IllegalArgumentException("Registration number is required");
        }
        this.registrationNumber = registrationNumber;
        vehicleCount++;
    }

    public String getRegistrationNumber() { return registrationNumber; }
    public static int getVehicleCount() { return vehicleCount; }
    public abstract double calculateFee(int hours);

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + registrationNumber + "]";
    }
}

class DemoCar extends DemoVehicle {
    public DemoCar(String registrationNumber) {
        super(registrationNumber);
    }

    @Override
    public double calculateFee(int hours) {
        if (hours < 0) throw new IllegalArgumentException("Hours cannot be negative");
        return hours * 30.0;
    }
}

class DemoElectricCar extends DemoCar implements PassHolder {
    private final boolean validPass;

    public DemoElectricCar(String registrationNumber, boolean validPass) {
        super(registrationNumber);
        this.validPass = validPass;
    }

    @Override
    public double calculateFee(int hours) {
        return super.calculateFee(hours) + 20.0;
    }

    @Override
    public boolean hasValidPass() { return validPass; }
}

public class OOPConceptDemo {
    public static void main(String[] args) {
        DemoVehicle[] vehicles = {
            new DemoCar("TN01AB1234"),
            new DemoElectricCar("TN02CD5678", true)
        };

        for (DemoVehicle vehicle : vehicles) {
            System.out.println(vehicle + " fee = Rs " + vehicle.calculateFee(2));
        }
        System.out.println("Objects created = " + DemoVehicle.getVehicleCount());
        System.out.println("EV pass valid = " + ((PassHolder) vehicles[1]).hasValidPass());
    }
}
