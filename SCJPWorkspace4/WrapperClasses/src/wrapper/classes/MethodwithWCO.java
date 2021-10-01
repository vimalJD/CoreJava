package wrapper.classes;

public class MethodwithWCO {

	public static void m1(Integer io) {
		System.out.println("Integer-arg: " + io);
	}

	public static void main(String[] args) {

		// We cannot call wrapper class parameter method by passing other wrapper class
		// object as
//		m1((byte) 50);
		m1((int) 50);
		m1((int) 'a');
		m1(60);
		m1((int) 70L);
		m1((int) 70L);
		m1((int) 80.45);

//		m1(new Byte((byte) 50));
//		m1(new Character('a'));
		m1(new Integer(60));
//		m1(new Long(70L));
//		m1(new Double(80.45));

	}

}
