package junit;

public class BankAcc {

double AccBalance;
	
	
	
	public BankAcc(double AccBalance) {
		super();
		this.AccBalance = AccBalance;
	}

	
	void withdraw(double withdrawAmt) throws InsufficientFundsException {
		
		if(withdrawAmt>AccBalance)
			throw new InsufficientFundsException("InsufficientFundsException");
		
		AccBalance=AccBalance-withdrawAmt;
		
		System.out.println("Amount WithDrawn: "+withdrawAmt);
		System.out.println("Available Balance: "+AccBalance);
	}
	
	public static void main(String[] args) {
		
		BankAcc acc=new BankAcc(20000.00);

		try {
			acc.withdraw(20000.00);
		} catch (InsufficientFundsException e) {
		
			e.printStackTrace();
		}
		
	}
}
