package overloaded.constructor;

class Example {

	public Example() {
		System.out.println("Exa No-arg constructor");
	}

	Example(int a) {
		System.out.println("Exa int-arg constructor");
	}

	Example(String str) {
		System.out.println("Exa String-arg constructor");
	}
}
