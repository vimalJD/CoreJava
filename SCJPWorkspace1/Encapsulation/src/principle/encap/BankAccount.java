package principle.encap;

public class BankAccount {

	private double balance;

	public void setBalance(double balance) {

		if (balance <= 0) {
			System.out.println("do not enter -ve ammount");
		} else {
			this.balance = balance;
		}
	}

	public double getBalance() {
		return balance;
	}

}
