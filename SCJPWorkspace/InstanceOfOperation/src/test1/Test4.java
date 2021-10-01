package test1;

public class Test4 {
	static void m3(Object object) {

		if (object instanceof Example) {
//			Examlple examlple = new Examlple();
			Example examlple = (Example) object;
			examlple.m1();
			System.out.println("instanceof example m1");
		}

		else if (object instanceof Sample) {
			Sample sample = (Sample) object;
			sample.m1();
			System.out.println("instance of sample m1");
			sample.m2();
			System.out.println("instance of sample m2");
		}
	}

	public static void main(String[] args) {
		Test4.m3(new Example());
		System.out.println(new Example());
		
		Test4.m3(new Sample());
		System.out.println(new Sample());
		
		Test4.m3(new Object());
		System.out.println(new Object());

	}
}
