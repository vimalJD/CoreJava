//42sbcapacityandsize

package string.handling1.bufferbuilder;

public class _33SBCapacityAndSize {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer(3);
		System.out.println("SB1 capacity: " + sb1.capacity());
		System.out.println("SB1 length: " + sb1.length());
		System.out.println("SB1 chars: " + sb1);
		System.out.println();

		sb1.append("a");
		sb1.append("b");
		sb1.append("c");
		System.out.println("SB1 capacity: " + sb1.capacity());
		System.out.println("SB1 length: " + sb1.length());
		System.out.println("SB1 chars: " + sb1);
		System.out.println();

		sb1.append("d");
		System.out.println("SB1 capacity: " + sb1.capacity());
		System.out.println("SB1 length: " + sb1.length());
		System.out.println("SB1 chars: " + sb1);
		System.out.println();

		sb1.append("efghf");
		System.out.println("SB1 capacity: " + sb1.capacity());
		System.out.println("SB1 length: " + sb1.length());
		System.out.println("SB1 chars: " + sb1);
		System.out.println();

		StringBuffer sb2 = new StringBuffer(2);
		System.out.println("SB2 capacity: " + sb2.capacity());
		System.out.println("SB2 length: " + sb2.length());
		System.out.println("SB2 chars: " + sb2);
		System.out.println();

		sb2.append("abcdefg");
		System.out.println("SB2 capacity: " + sb2.capacity());
		System.out.println("SB2 length: " + sb2.length());
		System.out.println("SB2 chars: " + sb2);
		
		sb2.append("hi");
		System.out.println("SB2 capacity: " + sb2.capacity());
		System.out.println("SB2 length: " + sb2.length());
		System.out.println("SB2 chars: " + sb2);
	}
}
