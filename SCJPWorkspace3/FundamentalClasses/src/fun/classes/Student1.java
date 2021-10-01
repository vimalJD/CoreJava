package fun.classes;

public class Student1 {

	private int sNo;
	private String sName;
	private String course;

	public Student1(int sNo, String sName, String course) {

		this.sNo = sNo;
		this.sName = sName;
		this.course = course;
	}

	@Override
	public int hashCode() {
		return sNo;
	}

}
