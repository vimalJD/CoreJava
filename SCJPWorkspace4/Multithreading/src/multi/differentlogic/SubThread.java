package multi.differentlogic;

public class SubThread extends Thread {

	int diff = 0;

	@Override
	public void run() {
		for (int i = 50; i >=1; i--) {

//			diff -= i;
			
			System.out.println("The Subtraction: " + diff + i);
		}
	}
}
