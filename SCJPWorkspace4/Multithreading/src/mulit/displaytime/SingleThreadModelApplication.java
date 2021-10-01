package mulit.displaytime;

public class SingleThreadModelApplication {

	public static void main(String[] args) {

		PrintNumbers pn = new PrintNumbers();

		long time1 = System.currentTimeMillis();
		
		System.out.println("Time1: "+time1);
		pn.print1To50();
		System.out.println();
		pn.print50To1();

		System.out.println();
		long time2 = System.currentTimeMillis();
		
		System.out.println("Time2: "+time2);
		System.out.println("Time is taken to complete both task: " + ((time2 - time1) / 1000) + " secs");

	}
}
