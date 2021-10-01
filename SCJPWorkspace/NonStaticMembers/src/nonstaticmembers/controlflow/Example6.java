package nonstaticmembers.controlflow;

public class Example6 {

	static Example6 example6 = new Example6();
	
	static {
		System.out.println("SB");
	}
	{
		System.out.println("NSB");
	}
	public Example6() {

		System.out.println("in no-arg cons");
	}
	
	public static void main(String[] args) {
		
		System.out.println("in main");
	}
}
