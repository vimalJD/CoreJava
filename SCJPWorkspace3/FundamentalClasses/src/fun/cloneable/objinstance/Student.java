package fun.cloneable.objinstance;

public class Student implements Cloneable {

	int sNo = 1;
	String sName = "Vimal";
	String course = "java";
	double fee = 1000;
	Address address = new Address();

	public static void main(String[] args) throws CloneNotSupportedException {

		Student student = new Student();
		Student student2 = (Student) student.clone();
		System.out.println(student.address == student2.address);
	}
}
