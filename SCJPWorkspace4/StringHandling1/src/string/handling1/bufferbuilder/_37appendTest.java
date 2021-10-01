//Operation #26: Appending new string characters 
package string.handling1.bufferbuilder;

public class _37appendTest {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		System.out.println("SB capacity: " + sb.capacity());
		System.out.println("SB length: " + sb.length());
		System.out.println("SB chars: " + sb);
		System.out.println();

		sb.append("a");
		System.out.println("SB capacity: " + sb.capacity());
		System.out.println("SB length: " + sb.length());
		System.out.println("SB chars: " + sb);
		System.out.println();

		sb.append(10);
		System.out.println("SB capacity: " + sb.capacity());
		System.out.println("SB length: " + sb.length());
		System.out.println("SB chars: " + sb);
		System.out.println();

		Pqr p1 = new Pqr();
		sb.append(p1);
		System.out.println("SB capacity: " + sb.capacity());
		System.out.println("SB length: " + sb.length());
		System.out.println("SB chars: " + sb);
		System.out.println();

//		sb.append(null);
		sb.append((String)null);
		System.out.println("SB capacity: " + sb.capacity());
		System.out.println("SB length: " + sb.length());
		System.out.println("SB chars: " + sb);
		System.out.println();
		
		sb.append(sb.append(p1));
		System.out.println("SB capacity: " + sb.capacity());
		System.out.println("SB length: " + sb.length());
		System.out.println("SB chars: " + sb);

		/*sb.append((char[]) null);
		System.out.println();*/
	}
}
