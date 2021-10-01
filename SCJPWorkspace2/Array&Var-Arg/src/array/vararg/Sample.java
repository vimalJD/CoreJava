package array.vararg;

public class Sample extends Example {

	public static void main(String[] args) {

		/*
		 * Object[] objects2 = new Example[5]; objects2[0] = new Example(); objects2[1]
		 * = new Sample(); objects2[2] = new Test();
		 */

		Example[] example = new Sample[5];

		example[1] = new Sample();
//		example[2] = new Test();
		example[3] = new Example();
//		example[4] = new Example[2];
	}
}
