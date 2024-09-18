package demo;

public class A {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount > 0.0) {
            this.amount = amount;
        }
    }
}
