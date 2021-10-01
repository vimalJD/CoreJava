package castoperation;

public class B1 {

	public static void main(String[] args) {

		byte b = 1;
		byte b1 = 1;

		int b3 = b + b1;
		byte b4 = (byte) (b + b1);
		System.out.println(b3);
		System.out.println(b4);
	}
}
