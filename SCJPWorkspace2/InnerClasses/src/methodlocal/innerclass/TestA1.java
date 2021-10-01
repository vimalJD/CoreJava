package methodlocal.innerclass;

class TestA1 {

	public static void main(String[] args) {

		A1 a = new A1();

		System.out.println("below stored in interface reference");
		Example e = a.m1();

		System.out.println("below reference of interface");
		e.m3();
	}
}
