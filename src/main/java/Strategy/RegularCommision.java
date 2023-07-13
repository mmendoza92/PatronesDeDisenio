package Strategy;

public class RegularCommision implements CommissionStrategy {
    public double applyCommission(double amount) {
        return amount * 0.10;
    }
}
