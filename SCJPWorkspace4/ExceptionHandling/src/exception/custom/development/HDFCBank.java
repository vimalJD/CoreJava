package exception.custom.development;

public class HDFCBank implements Bank {

	private double balance;
//	private double amt;

	@Override
	public void deposite(double amount) throws InvalidAmountException {

		if (amount <= 0) {
			throw new InvalidAmountException(amount + " is invalide amount");
		}
		balance = balance + amount;
	}

	@Override
	public double withdraw(double amount) throws InvalidAmountException, InSufficientFundsException {

		if (amount <= 0) {
			throw new InvalidAmountException(amount + " is invalide amount");
		}
		if (balance < amount) {
			throw new InSufficientFundsException("InSufficient funds");
		}

		balance = balance - amount;
		return amount;
	}

	@Override
	public void balanceEnquiry() {
		System.out.println("Current Balance: " + balance);

	}

}
