package fun.classes;

class Example {
	int x = 10;
	int y = 20;

};

public class HashCodeDemo {

	public static void main(String[] args) {

		Example3 e = new Example3();
		Example3 e1 = new Example3();

		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());
	}
}
