package nonstaticmembers.classload.injvm;

public class Test {

	public static void main(String[] args) {
		
		//RE in class B
		A a = new A();
		a.m1();
		
		B b = new B();
		b.m3("Vimal");
	}
}
