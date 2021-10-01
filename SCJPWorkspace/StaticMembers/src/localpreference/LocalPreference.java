package localpreference;

public class LocalPreference {

	static int a = 10;
	static int b = 20;

	public static void main(String[] args) {
		System.out.println(a + "..." + b);
		int a = 50;
		System.out.println(a + "..." + b);
	}
}
