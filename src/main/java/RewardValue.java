public class RewardValue {
    private final double cash_value;

    public RewardValue(double cash_value) {
        this.cash_value = cash_value;
    }

    public RewardValue(int miles_value) {
        this.cash_value = convert_to_cash(miles_value);
    }

    private static int convert_to_miles(double cashValue) {
        return (int) (cashValue / 0.0035);
    }

    private static double convert_to_cash(int milesValue) {
        return milesValue * 0.0035;
    }

    public double getCashValue() {
        return cash_value;
    }

    public int getMilesValue() {
        return convert_to_miles(this.cash_value);
    }
}