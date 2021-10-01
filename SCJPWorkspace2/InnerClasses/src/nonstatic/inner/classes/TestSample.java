package nonstatic.inner.classes;

public class TestSample {

	public static void main(String[] args) {

		Sample.B b1 = new Sample().new B();

		b1.m1();

		Sample s = new Sample();
		Sample.B b2 = s.new B();
		b2.m1();
	}
}
