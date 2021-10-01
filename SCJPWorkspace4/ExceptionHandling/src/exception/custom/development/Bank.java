package exception.custom.development;

public interface Bank {

	public void deposite(double amount) throws InvalidAmountException;

	public double withdraw(double amount) throws InvalidAmountException, InSufficientFundsException;

	public void balanceEnquiry();
}
