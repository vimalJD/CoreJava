package wrapper.classes;

public class Example {

	static void m1(int a) {
		System.out.println("int-arg");
	}
	
	static void m1(Integer io) {
		System.out.println("Integer-arg");
	}
	
	public static void main(String[] args) {
		
		m1(50);
		m1('a');
		m1(new Integer(50));
		m1(new Character('a'));
//		m1(new Long(70));
	}
}
