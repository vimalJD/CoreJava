package opandcontrolflow;

public class TestOpAndContr {

	public static void main(String[] args) {

		boolean b1 = 7 == 8;
		System.out.println(b1);

		System.out.println(true ? "Hi" : "Hello");
		System.out.println(false ? "Hi" : "Hello");

		String s1 = true ? "Hi" : "Hello";
		String s2 = false ? "Hi" : "Hello";

		System.out.println(s1);
		System.out.println(s2);

		String s3 = true ? "Hi" : "Hello";
		System.out.println(s3);

		String s4;
		if (true) {
			s4 = "Hi";
		} else {
			s4 = "Hello";
		}
		System.out.println(s4);
	}
}
