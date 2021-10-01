package multi.controlling.threadsexecution;

public class Test36_joinDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("main is started");
		
		JoinDemo1 jd1 = new JoinDemo1();
		jd1.setName("child1");
		jd1.start();
		
		JoinDemo1 jd2 = new JoinDemo1();
		jd2.setName("child2");
		jd2.start();
		
		jd1.join();
		jd2.join();
		
		System.out.println("main executed");
	}
}
