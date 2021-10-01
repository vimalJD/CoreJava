package wrapper.classes.overloaded;

public class ABUBWithSwitch {

	static void m1(Integer io) {

		switch (io) {

		case 1:
			System.out.println("Case 1: ");
			break;

		case 2:
			System.out.println("Case 2: ");
			break;

		default:
			System.out.println("default");
		}
	}

	public static void main(String[] args) {

		m1(1);
		m1(2);
		m1(3);
		m1(-1);
//		m1(null);
	}
}