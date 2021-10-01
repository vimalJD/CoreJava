package methodover.examples;

public class A6 {

	void m1(String string) {
		System.out.println("A String-arg");
	}
}

class B6 extends A6 {

	void m1(Object object) {
		System.out.println("B Object-arg");
	}
}

class MOL9WithInheritance{
	
	public static void main(String[] args) {
		
		B6 b = new B6();
		b.m1("a");
		b.m1(10);
		
		System.out.println();
		A6 a = new B6();
		a.m1("a");
//		a.m1(10);
	}
}
