package nonstaticmembers;

public class PassingpPrDataArg {

	/*void m1(int p) {
		// TODO Auto-generated method stub

		p = 60;
	}*/
	
	static int m1(int p) {
		
		return p=70;
	}

	public static void main(String[] args) {

//		PassingpPrDataArg p = new PassingpPrDataArg();

		int x = 50;
//		p.m1(x);
		m1(x);
		System.out.println(x);

	}
}
