package wrapper.classes;

public class WrapperClassesComparision {

	public static void main(String[] args) {

		int i1 = 10;
		int i2 = 10;

		System.out.println(i1 == i2);
//		System.out.println(i1.equals(i2));

		Integer io1 = new Integer(10);
		Integer io2 = new Integer(20);

		System.out.println(io1 == io2);
		System.out.println(io1.equals(io2));

		Double do1 = new Double(10.0);
//		System.out.println(io1==do1);
		System.out.println(io1.equals(do1));

		double d1 = 10.0;
		System.out.println(i1 == d1);
	}
}
