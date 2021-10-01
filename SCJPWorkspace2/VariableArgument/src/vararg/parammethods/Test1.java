package vararg.parammethods;

public class Test1 {

	public static void main(String[] args) {

//		Addition1.add(null);
		Addition1.add(new int[0]);
		Addition1.add(new int[] { 5 });
		Addition1.add(new int[] { 5, 6 });
		Addition1.add(new int[] { 5, 6, 7 });
		Addition1.add(new int[] { 5, 6, 7, 8 });
	}
}
