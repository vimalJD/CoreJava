package nonstaticmembers.controlflow;

public class Example8 {

	int x = 5;
	int y = 10;

//	public static Example8 example8 = new Example8();
	
	{

		System.out.println("Instance Initializer Block");
		System.out.println(example8.x);
		System.out.println(example8.y);
	}

	public static Example8 example8 = new Example8();
	
	public static void main(String[] args) {

		
		
	}
}
