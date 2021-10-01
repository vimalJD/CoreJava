package multi.threadpriorityandname;

public class Tets26_ThreadNamePriority {

	public static void main(String[] args) {

		MyThread1 mt1 = new MyThread1();
		MyThread1 mt2 = new MyThread1("child2");

		System.out.println("mt1 Thread's initial name and priority");
		System.out.println("mt1 name: " + mt1.getName());
		System.out.println("mt1 priority: " + mt1.getPriority());

		System.out.println();

		System.out.println("mt2 Thread's initial name and priority");
		System.out.println("mt2 name: " + mt2.getName());
		System.out.println("mt2 priority: " + mt2.getPriority());

		mt1.setName("child1");
		mt1.setPriority(6);

		mt2.setPriority(9);

		System.out.println();
		System.out.println("after name and priority set\n");
		System.out.println("mt1 Thread's initial name and priority");
		System.out.println("mt1 name: " + mt1.getName());
		System.out.println("mt1 priority: " + mt1.getPriority());

		System.out.println();

		System.out.println("mt2 Thread's initial name and priority");
		System.out.println("mt2 name: " + mt2.getName());
		System.out.println("mt2 priority: " + mt2.getPriority());

		mt1.start();
		mt2.start();

		for (int i = 0; i < 10; i++) {

			System.out.println("main i: " + i);
		}
	}
}
