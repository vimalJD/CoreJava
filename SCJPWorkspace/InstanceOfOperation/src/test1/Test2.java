package test1;

public class Test2 {
	static void m3(Example e) {
		e.m1();

		//RE CCE
		Sample s = (Sample) e;
		s.m2();
	}

	public static void main(String[] arsg) {

		Test2.m3(new Sample());
		//RE CCE
		Test2.m3(new Example());
	}
}
