package array.garbagecollection;

public class GCWithArr {

	static void m1(Example[] e) {

		e[1] = null;
		e = null;
	}

	public static void main(String[] args) {

		Example[] e = new Example[5];
		e[0] = new Example();
		e[1] = new Example();
		e[2] = new Example();

		Example e1 = new Example();
		e[3] = e1;

		/*
		 * line #1: examples= null; line #2: m1(example); line #1: example= null;
		 */
	}
}
