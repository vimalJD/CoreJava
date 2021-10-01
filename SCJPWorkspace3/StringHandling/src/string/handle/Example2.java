package string.handle;

public class Example2 {

	int x;

	public Example2(int x) {
		this.x = x;
	}
	
	String m1() {
		return 
		//String.valueOf(x);
		//""+x;
		Integer.toString(x);		
	}
}
