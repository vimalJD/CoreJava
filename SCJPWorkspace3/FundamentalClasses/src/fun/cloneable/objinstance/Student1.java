package fun.cloneable.objinstance;

public class Student1 implements Cloneable {

	int sNo = 1;
	String sName = "Vimal";
	String course = "java";
	double fee = 1000;
	Address1 address1 = new Address1();

	@Override
	public Student1 clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student1 student1 = (Student1) super.clone();
		student1.address1 = this.address1.clone();
		return student1;
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		Student1 student = new Student1();
		Student1 student2 = student.clone();
		System.out.println(student.address1 == student2.address1);
	}
}
