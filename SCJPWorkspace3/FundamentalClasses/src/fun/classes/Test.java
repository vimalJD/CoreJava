package fun.classes;

public class Test {

	public static void main(String[] args) {

		/*
		 * Student s = new Student(101, "Vimal", "Java"); Student s1 = new Student(102,
		 * "Vimal1", "Adv_Java");
		 * 
		 * System.out.println(s.hashCode()); System.out.println(s1.hashCode());
		 */

		Student1 s = new Student1(101, "Vimal", "Java");
		Student1 s1 = new Student1(102, "Vimal1", "Adv_Java");

		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
	}
}
