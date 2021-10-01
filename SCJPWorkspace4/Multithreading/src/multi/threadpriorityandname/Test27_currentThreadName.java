package multi.threadpriorityandname;

public class Test27_currentThreadName {

	static {
		System.out.println("In sb");

		// retrieving currently executing thread reference

		Thread th = Thread.currentThread();
		System.out.println("sb is executing in \"" + th.getName() + "\"thread\n");
	}

	public static void main(String[] args) {

		System.out.println("\nin main method");

		// retrieving currently executing thread reference
		Thread th = Thread.currentThread();

		System.out.println("Original name and priority of main thread");
		System.out.println("Current thread name: " + th.getName());
		System.out.println("Current thread priority: " + th.getPriority());

		th.setName("xxyy");
		th.setPriority(7);

		System.out.println("\nmodified name and priority of main thread");
		System.out.println("current thread name: " + th.getName());
		System.out.println("Current thread priority: " + th.getPriority());
	}
}
