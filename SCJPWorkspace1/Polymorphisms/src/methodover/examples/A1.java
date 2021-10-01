package methodover.examples;

class A1 {

	void m1(float f) {
		System.out.println("A float-arg");
	}

};

class B1 extends A1 {

	void m1(int a) {
		System.out.println("B int-arg");
	}
};

class MOL5WithInheritance {

	public static void main(String[] args) {

		B1 b = new B1();
		b.m1(50);
		b.m1('a');
		b.m1(50L);

		System.out.println();
		A1 a = new B1();
		a.m1(50);
		a.m1('a');
		a.m1(50L);
	}
}