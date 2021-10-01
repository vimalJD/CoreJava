package multi.threadpriorityandname;

public class Example {

	static {
		Thread th = Thread.currentThread();
		System.out.println("Example class is loaded through the thread: " + th.getName());
	}

	static void m1() {
		Thread th = Thread.currentThread();
		System.out.println("Example class m1() is executing in the thread: " + th.getName());
	}
}


