import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class AccountTest {

    @Test
    public void depositShouldIncreaseBalanceWhenPositiveAmount() {
        final var account = AccountFactory.createEmptyAccount();
        final var expectAmount = 196.0;

        account.deposit(200.0);

        assertEquals(expectAmount, account.getBalance());
    }

    @Test
    public void depositShouldNotIncreaseBalanceWhenNegativeAmount() {
        final var account = AccountFactory.createEmptyAccount();

        assertThrows(IllegalArgumentException.class, () -> account.deposit(-200.0));
        assertEquals(0.0, account.getBalance());
    }

    @Test
    public void fullWithdrowShouldClearBalance() {
        final var account = AccountFactory.createAccount(200.0);
        account.fullWithdraw();
        final var expectedBalance = 0.0;

        assertTrue(expectedBalance == account.getBalance());
    }

    @Test
    public void withdrowShouldDecreaseBalanceWhenSufficientBalance() {
        final var account = AccountFactory.createAccount(300.0);
        account.withdraw(200.0);
        final var expectedBalance = 100.0;

        assertEquals(expectedBalance, account.getBalance());
    }

    @Test
    public void withdrowShouldNotDecreaseBalanceWhenSufficientBalance() {
        final var account = AccountFactory.createAccount(300.0);

        assertThrows(IllegalArgumentException.class, () -> account.withdraw(301.0));
    }
}
