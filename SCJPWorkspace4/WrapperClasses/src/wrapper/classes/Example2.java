package wrapper.classes;

public class Example2 {

	static void m1(long l) {
		System.out.println("long-arg");
	}
	
	static void m1(Double d) {
		System.out.println("Double-arg");
	}
	static void m1(Object obj) {
		System.out.println("Object-arg");
	}
	
public static void main(String[] args) {
		
		m1(50);
		m1('a');
		m1(new Integer(50));
		m1(new Character('a'));
		m1(new Long(70));
		m1(80.45);
		m1(true);
	}
}
