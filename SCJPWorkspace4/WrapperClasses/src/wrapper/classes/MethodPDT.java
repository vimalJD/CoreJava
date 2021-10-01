package wrapper.classes;

public class MethodPDT {

	static void m1(int a) {
		
		System.out.println("int-arg: "+a);
	}
	
	public static void main(String[] args) {
		
		m1((byte) 50);
		m1('a');
		m1(60);
//		m1(70L);
		m1((int) 70L);
		m1((int) 80.45);
		
		m1(new Byte((byte) 50));
		m1(new Character('a'));
		m1(new Integer(60));
//		m1(new Long(70L));
//		m1(new Double(80.45));
		
	}
}
