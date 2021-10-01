package string.handling1.bufferbuilder;

public class _46diff6Comarison {


//	private static String sb;
	private static String s;

	static void m1(String s) {
		m1("abc");
	}

	static void m1(StringBuffer sb) {
		m1(new StringBuffer("abc"));
	}
	
	public static void main(String[] args) {
		
		_46diff6Comarison.m1(s);
		System.out.println(s);
		
		/*_46diff6Comarison.m1(sb);
		System.out.println(sb);*/
		
	}
}
