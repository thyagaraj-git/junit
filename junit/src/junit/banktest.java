package junit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class banktest {

	@Test
	void test() {
		BankAcc acc1 = new BankAcc(25000.00);

		assertThrows(InsufficientFundsException.class, () -> acc1.withdraw(30000.0));

	}
}
