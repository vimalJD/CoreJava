package string.handling1.bufferbuilder;

public class _45stringSBComparision {

	public static void main(String[] args) {
		
		String s1="a";
		String s2="a";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println();
		
		String s3 = new String("a");
		String s4 = new String("a");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		System.out.println();
		
		StringBuffer sb1 = new StringBuffer("a");
		StringBuffer sb2 = new StringBuffer("a");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.hashCode());
		System.out.println();
	}
}
