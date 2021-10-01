//ensureCapacity
package string.handling1.bufferbuilder;

public class Example1 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());

		sb.ensureCapacity(17);
		System.out.println(sb.capacity());

		sb.ensureCapacity(100);
		System.out.println(sb.capacity());

		sb.ensureCapacity(-3);
		System.out.println(sb.capacity());
	}
}
