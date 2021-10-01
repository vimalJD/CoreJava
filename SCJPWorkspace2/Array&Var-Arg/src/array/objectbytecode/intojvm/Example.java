package array.objectbytecode.intojvm;

class Example {

	static {
		System.out.println("Example is loaded");
	}

	public static void main(String[] args) {

//		Example[] e = new Example[5];

		Example[] e = { new Example(), new Example() };

	}
}
