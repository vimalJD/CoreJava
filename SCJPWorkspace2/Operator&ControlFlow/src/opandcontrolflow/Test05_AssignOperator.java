package opandcontrolflow;

public class Test05_AssignOperator {

	public static void main(String[] args) {

		int y;
		int x;
//		x+y=10;

		int m;
		byte b1;
		long l1;
		boolean bo;

		l1 = m = 30;
//		b1=(byte) m=40;

		b1 = (byte) (m = 40);
//		b1= 20   =30;

//		int p=10+30=40;

		int p = 10 + (m = 40);
		System.out.println(p);

	}
}
