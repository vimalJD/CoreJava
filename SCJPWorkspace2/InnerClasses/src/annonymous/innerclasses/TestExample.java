package annonymous.innerclasses;

class TestExample {

	public static void main(String[] args) {

		Thread th1 = new Thread();
		Thread th2 = new Thread() {
		};

		Example example = new Example();

		example.m1(new Thread() {

			public void run() {
				System.out.println("Hi");
			}
		});
	}
}
