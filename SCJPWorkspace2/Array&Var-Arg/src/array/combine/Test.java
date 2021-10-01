package array.combine;

class Test {

	static Example[] e1 = new Example[5];

	Example[] e2 = { new Example(), new Example() };

	public static void main(String[] args) {

		System.out.println("Test main");

		Example[] e3 = new Example[2];

		System.out.println("e3 array object is created");

		e1[1] = new Example();
		e3[1] = new Example();

		System.out.println(e1[1].x);
//		System.out.println(e2[1].x);

		System.out.println(e3[1].x);

		Test t = new Test();
		System.out.println(t.e2[1].x);

//		System.out.println(e1[0].x);
		System.out.println(t.e2[0].x);
//		System.out.println(e3[0].x);
//		System.out.println(t.e1[0].y);
	}
}
