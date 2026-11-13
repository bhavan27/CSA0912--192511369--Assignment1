package parking.model;
public class MonthlyPass implements ParkingPass {
    private final boolean valid;
    public MonthlyPass(boolean valid) { this.valid = valid; }
    @Override public boolean isValid() { return valid; }
    @Override public double discount() { return 1.0; }
}
