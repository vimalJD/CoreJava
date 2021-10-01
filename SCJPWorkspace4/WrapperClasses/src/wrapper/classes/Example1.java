package wrapper.classes;

public class Example1 {

	static void m1(long l) {
		System.out.println("long-arg");
	}
	
	static void m1(Character ch) {
		System.out.println("Character-arg");
	}
	static void m1(Number n) {
		System.out.println("Number-arg");
	}
	
	public static void main(String[] args) {
		
		m1(50);
		m1('a');
		m1(new Integer(50));
		m1(new Character('a'));
		m1(new Long(70));
		m1(80.45);
//		m1(true);
	}
}
