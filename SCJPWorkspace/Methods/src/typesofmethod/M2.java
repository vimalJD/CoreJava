package typesofmethod;

public class M2 {

	static void m1(int a) {

		System.out.println("m1 :" + a);
	}

	static void m2() {
		System.out.println("m2");

	}
	
	static int m3(int a) {
		
		
		return 10+'a';
		
	}
	
	public static int m4() {
		
		System.out.println("m4");
		return 'a';
		
	}
	public static void main(String[] args) {

		m1(50);

		m2();
		
		System.out.println(m3(0));
		
		m4();
		int x = m4();
		System.out.println(m4());
		
		/*int y = m1(0);
		System.out.println(m1(0););*/
	}
}
