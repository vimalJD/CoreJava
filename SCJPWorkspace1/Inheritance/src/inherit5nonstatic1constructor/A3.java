package inherit5nonstatic1constructor;

public class A3 {

	int a = m1();

	int m1() {

		System.out.println("A Non Static Variable");
		return 10;
	}

	{

		System.out.println("A Non static Block");
	}

	public A3() {
		System.out.println("class A Constructor");
	}

}
