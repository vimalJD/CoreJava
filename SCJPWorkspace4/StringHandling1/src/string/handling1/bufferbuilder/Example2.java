package string.handling1.bufferbuilder;

public class Example2 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();

		for (int i = 1; i <= 17; i++) {

			sb.append(i);
		}

		System.out.println(sb.capacity());
		System.out.println(sb.length());

	}
}
