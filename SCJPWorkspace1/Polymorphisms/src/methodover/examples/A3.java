package methodover.examples;

class A3 {

	void m1(int a) {
		System.out.println("A int-arg");
	}

	void m1(char c) {
		System.out.println("A char-arg");
	}
};

class B3 extends A3 {

	void m1(float f) {
		System.out.println("B float-arg");
	}

	void m1(char c) {
		System.out.println("B char-arg");
	}

};

class MOL5_2WithInheritance {

	public static void main(String[] args) {

		B3 b = new B3();
		b.m1(50);
		b.m1('a');
		b.m1(50L);

		System.out.println();
		A3 a = new B3();
		a.m1(50);
		a.m1('a');
//		a.m1(50L);
	}
}
