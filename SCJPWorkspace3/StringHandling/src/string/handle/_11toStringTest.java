//Operation #3: Printing string objects content
package string.handle;

public class _11toStringTest {

	public static void main(String[] args) {
		
		String s1="Vimal";
		System.out.println("s1: "+s1);
		System.out.println("s1: "+s1.toString());
		System.out.println();
		
		String s2 = new String("Java DevOps");
		System.out.println("s2: "+s2);
		System.out.println("s2: "+s2.toString());
		System.out.println();
		
		String s3 = null;
		System.out.println("s3: "+s3);
//		System.out.println("s3: "+s3.toString());
		System.out.println();
		
		/*String s4;
		System.out.println("s4: "+s4);*/
		System.out.println();
		
		System.out.println("s5: "+s5);
		System.out.println();
		
		A a1 = new A(567);
		System.out.println("a1: "+a1);
		
		A a2 = null;
		System.out.println("a2: "+a2);
		
		/*A a3;
		System.out.println("a3: " + a3);*/
		
		System.out.println("a4: "+a4);
	}
	static String s5;
	static A a4;
}
