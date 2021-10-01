package file.custserializaion;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Student implements java.io.Serializable {

	int rollNum;
	String sname;
	transient Address add;

	public Student(int rollNum, String sname, Address add) {

		this.rollNum = rollNum;
		this.sname = sname;
		this.add = add;
	}

	private void writeObject(ObjectOutputStream oos) {

		try {

			oos.defaultWriteObject();

			// writing current student's Address
			oos.writeInt(add.hno);
			oos.writeUTF(add.city);

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream ois) {

		try {
			ois.defaultReadObject();

			// reading current student's address state
			int hno = ois.readInt();
			String city = ois.readUTF();

			add = new Address(hno, city);

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", sname=" + sname + ", hno=" + add.hno + " , city=" + add.city + "]";
	}

}
