package vararg.parammethods;

public class Test2 {

	public static void main(String[] args) {

		Addition2.add();
		Addition2.add(5);
		Addition2.add(5, 6);
		Addition2.add(5, 6, 7);
		Addition2.add(5, 6, 7, 8);
		Addition2.add(new int[] { 5, 6, 7, 8, 9 });
	}
}
