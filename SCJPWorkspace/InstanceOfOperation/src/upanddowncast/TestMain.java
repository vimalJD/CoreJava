package upanddowncast;

public class TestMain {

	public static void main(String[] args) {

		Example example = new Sample();

		example.m1();
		// CE can not find symbol
		// example.m2();

		Sample sample = (Sample) example;
		
		/*Object object = new Example();
		Sample sample = (Sample) object;*/
		// it leads class cast exception
		 sample.m2();
	}
}
