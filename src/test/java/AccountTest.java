import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertThrows;

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
}
