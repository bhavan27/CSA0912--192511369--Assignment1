package parking.model;

public abstract class Vehicle {
    private final String registrationNumber;

    protected Vehicle(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isBlank())
            throw new IllegalArgumentException("Registration number is required");
        this.registrationNumber = registrationNumber.trim().toUpperCase();
    }

    public String getRegistrationNumber() { return registrationNumber; }
    public abstract double hourlyRate();

    @Override public boolean equals(Object other) {
        return other instanceof Vehicle v &&
                registrationNumber.equals(v.registrationNumber);
    }
    @Override public int hashCode() { return registrationNumber.hashCode(); }
}
