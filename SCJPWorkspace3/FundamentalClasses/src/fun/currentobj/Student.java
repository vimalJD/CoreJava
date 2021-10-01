package fun.currentobj;

public class Student {

	private int sNo;
	private String sName;
	private String course;

	public Student(int sNo, String sName, String course) {

		this.sNo = sNo;
		this.sName = sName;
		this.course = course;
	}

	@Override
	public int hashCode() {
		return sNo;
	}

	public boolean equals(Object object) {

		if (this == object) {
			return true;
		} else {

			if (object instanceof Student) {

				Student s = (Student) object;

				return (this.sNo == s.sNo) && this.sName.equals(s.sName) && this.course.equals(s.course);
			} else {
				return false;
			}
		}

	}

	@Override
	public String toString() {

		return "No: " + sNo + "\n" + "Name: " + sName + "\n" + "Course: " + course + "\n";
	}
}
