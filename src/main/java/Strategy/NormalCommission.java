package Strategy;

public class NormalCommission implements CommissionStrategy {
    public double applyCommission(double amount) {
        return amount * 0.30;
    }
}
