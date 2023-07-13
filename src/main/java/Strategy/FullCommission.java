package Strategy;

public class FullCommission implements CommissionStrategy {
    public double applyCommission(double amount) {
        return amount * 0.50d;
    }
}
