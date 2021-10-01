package wrapper.classes.overloaded;

public class SwitchWithString {

	static void m1(String name) {

		switch (name) {

		case "PK":
			System.out.println("PK is hero number 1");
			break;

		case "MB":
			System.out.println("MB is hero number 2");
			break;

		case "Jr.NTR":
			System.out.println("Jr.NTR is hero number 3");
			break;

		default:
			System.out.println(name + " number is not decided");
		}
	}

	public static void main(String[] args) {

		m1("PK");
		m1("MB");
		m1("Jr.NTR");
		m1("Charan");
		m1("Prabhas");
	}
}
