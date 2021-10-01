package nonstaticmembers;

public class UsingThisKeyword {

	int x = 10;
	int y = 20;
	
	void setXY() {
		this.x=50;
		this.y=60;
	}
	
	void printXY() {
		System.out.println("x: "+this.x);
		System.out.println("y: "+this.y);
	}

	void m1() {
		this.setXY();
		this.printXY();
	}
	
	public static void main(String[] args) {

		System.out.println("in main method");
		UsingThisKeyword usingThisKeyword = new UsingThisKeyword();
		usingThisKeyword.m1();

	}
}
