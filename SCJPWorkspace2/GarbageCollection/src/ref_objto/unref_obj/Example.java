package ref_objto.unref_obj;

public class Example {

	int x = 10;
	int y = 20;

	public static void main(String[] args) {

		// creating referenced object

		Example example = new Example();
		Example example2 = new Example();

		// creating unreferenced object
		new Example();
		System.out.println(new Example());

		// unreferencing first object by storing null
		example = null;
		System.out.println(example);

		// unreferencing second object by assigning another object
		example2 = new Example();
		System.out.println(example2);

	}

	/*@Override
	public String toString() {
		return "Example [x=" + x + ", y=" + y + " , E= " + new Example() + " ]";
	}*/
}
