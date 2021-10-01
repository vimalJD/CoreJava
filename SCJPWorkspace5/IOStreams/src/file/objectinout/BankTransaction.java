package file.objectinout;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class BankTransaction {

	public static void main(String[] args) throws Exception {

		// creating bank object

		BankAccount acc1 = new BankAccount();

		// setting bank object state
		acc1.setAccNo(1);
		acc1.setAccHName("Vimal");
		acc1.setUsername("VimalPatel");
		acc1.setPassword("javadevops");
		acc1.setBalance(99999999);

		// print bank object state
		System.out.println(acc1);

		// creating oos object

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("BankAccountsinfo.ser"));

		// writing bank object state to file

		oos.writeObject(acc1);

		System.out.println("Object written to file");
	}
}
