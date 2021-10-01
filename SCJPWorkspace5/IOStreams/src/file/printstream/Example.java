package file.printstream;

//example of toString overridden in class
public class Example {

	int x = 10;
	int y = 20;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return "Example class object";
		return x + " ... " + y;
	}
};

class Test {

	public static void main(String[] args) {

		Example e = new Example();
		System.out.println(e);

		String s = "abc";
		System.out.println(s);
	}
}
