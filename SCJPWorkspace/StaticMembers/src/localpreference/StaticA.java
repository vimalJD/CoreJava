package localpreference;

public class StaticA {

	public static void main(String[] args) {
		
		System.out.println("main");
		m1();
	}

	static void m1() {
		// TODO Auto-generated method stub
		System.out.println("in m1");
		main(new String[0]);
	}
}
