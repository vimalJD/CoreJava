package principle.encap;

public class Clerk {
	public static void main(String[] args) {

		BankAccount bAccount = new BankAccount();

		// It leads CE because of private non static variable
		// bAccount.balance=-5000;

		bAccount.setBalance(5000);
		System.out.println(bAccount.getBalance());

		bAccount.setBalance(-5000);
		System.out.println(bAccount.getBalance());
	}
}
