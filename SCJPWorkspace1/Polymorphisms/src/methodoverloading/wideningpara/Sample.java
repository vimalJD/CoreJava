package methodoverloading.wideningpara;

public class Sample {

	public static void main(String[] args) {

		Example example = new Example();
		example.m1(10, 20.345f);
		example.m1(20.56f, 20);

//		example.m1(10, 20);
	}
}
