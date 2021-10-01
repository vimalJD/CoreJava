package localpreference;

public class CallMainInStaticBlock {

	static {
		System.out.println("Static block start:");
		main(new String[0]);
		main1(new String[0]); 
		System.out.println("Static block end:");
	}

	// we have changed string instead of args but which is not recommended of coding
	// standard

	public static void main1(String[] strings) {
		
		System.out.println("main with string");
		CallMainInStaticBlock.main(new String[0]);

	}

	public static void main(String[] args) {
		System.out.println("main with args");

	}
}
