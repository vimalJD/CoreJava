package fun.currentobj;

public class Test {

	public static void main(String[] args) {

		String s1 = "Vimal";
		Integer integer = 50;
		Object object = new A();
		B b1 = new B();
		C b2 = new C();

		A.m1(s1);
		A.m1(integer);
		A.m1(object);
		A.m1(b1);
		A.m1(b2);

	}
}
