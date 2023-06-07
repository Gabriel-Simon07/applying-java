public class Account {
    private Double balance;
    public static double DEPOSIT_FEE_PERCENTAGE = 0.02;

    public Account(Double balance) {
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("Amount invalid");
        }
        amount -= amount * DEPOSIT_FEE_PERCENTAGE;
        balance += balance + amount;
    }

    public double fullWithdraw() {
        double aux = balance;
        balance = 0.0;
        return  aux;
    }
}
