package wrapper.classes;

public class ObjectPooling {

	public static void main(String[] args) {

		Integer io1 = 50;
		Integer io2 = 50;
		System.out.println(io1 == io2);

		Integer io3 = 150;
		Integer io4 = 150;
		System.out.println(io3 == io4);

		Integer io5 = 127;
		Integer io6 = 127;
		System.out.println(io5 == io6);
	}
}
