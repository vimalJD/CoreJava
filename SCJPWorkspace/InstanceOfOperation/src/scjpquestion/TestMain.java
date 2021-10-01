package scjpquestion;

public class TestMain {
	public static void main(String[] args) {

		Beta x = new Beta();
		
		//Gyama leads CCE at RE it has not IS-A rel with foo interface.
		Foo f = (Gyama) x;
//		Foo f1 = (Alpha) x;
//		Beta b = (Beta) (Alpha) x;
	}
}
