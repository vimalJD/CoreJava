package methodoverloading.basics;

public class MOL4 {

	static void m1(byte b) {
		System.out.println("byte-arg");
	}

	public static void main(String[] args) {

//		m1(50);

		m1((byte) 50);

		byte b = 10;

		m1(b);
	}
}
