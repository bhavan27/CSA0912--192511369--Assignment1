package parking.model;
import java.time.LocalDate;
public class OneDayPass implements ParkingPass {
    private final LocalDate validDate;
    public OneDayPass(LocalDate validDate) { this.validDate = validDate; }
    @Override public boolean isValid() { return LocalDate.now().equals(validDate); }
    @Override public double discount() { return 1.0; }
}
