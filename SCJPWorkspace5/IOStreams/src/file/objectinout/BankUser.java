package file.objectinout;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class BankUser {

	public static void main(String[] args) throws Exception {

		// creating ois object
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("BankAccountsinfo.ser"));

		// casting return object to bank type
		BankAccount accDeatils = (BankAccount) ois.readObject();

		// printing bank object data
		System.out.println(accDeatils.getAccHName() + " details");
		System.out.println(accDeatils);

	}
}
