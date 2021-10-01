package finalmethodandclass;

public class Sample1 {

	public static void main(String[] args) {

		Example1 e = new Example1();
		e.x = 50;
		e.m1();
		// because non static variable y is declared as final in super class
//		e.y = 60;
		e.m2();

	}
}
