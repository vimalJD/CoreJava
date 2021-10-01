package string.handling1.bufferbuilder;

public class _43setLength {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("abcdefg");
		System.out.println("SB capacity: " + sb.capacity());
		System.out.println("SB length: " + sb.length());
		System.out.print("SB chars: " + sb);
		System.out.println("hari");

		// Case #1
		sb.setLength(9);
		System.out.println("SB capacity: " + sb.capacity());
		System.out.println("SB length: " + sb.length());
		System.out.print("SB chars: " + sb);
		System.out.println("hari");

		// case #2
		sb.setLength(4);
		System.out.println("SB capacity: " + sb.capacity());
		System.out.println("SB length: " + sb.length());
		System.out.print("SB chars: " + sb);
		System.out.println();

		// case #3
		sb.setLength(25);
		System.out.println("SB capacity: " + sb.capacity());
		System.out.println("SB length: " + sb.length());
		System.out.print("SB chars: " + sb);

		// case #4
//		sb.setLength(-34);
	}
}
