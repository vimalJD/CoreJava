package localpreference;

public class StaticBlock {

	static {
		System.out.println("sb");
	}

	public static void main(String[] args) {
		System.out.println("main");
	}

	static {
		System.out.println("sb1");
	}
}
