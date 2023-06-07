public class AccountFactory {
    public static Account createEmptyAccount() {
        return new Account(0.0);
    }

    public static Account createAccount(double initialBalance) {
        return new Account(initialBalance);
    }
}
