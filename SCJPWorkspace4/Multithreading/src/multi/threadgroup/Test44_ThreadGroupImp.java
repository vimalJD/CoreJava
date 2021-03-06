package multi.threadgroup;

public class Test44_ThreadGroupImp {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadGroup grpA = new ThreadGroup("Group A");
		ThreadGroup grpB = new ThreadGroup("Group B");
		
		ThreadGroupImp thdi1 = new ThreadGroupImp(grpA, "Thread1");
		ThreadGroupImp thdi2 = new ThreadGroupImp(grpA, "Thread2");
		ThreadGroupImp thdi3 = new ThreadGroupImp(grpB, "Thread3");
		ThreadGroupImp thdi4 = new ThreadGroupImp(grpB, "Thread4");
		
		grpA.list();
		grpB.list();
		
		System.out.println("Suspending group A..");
		
		grpA.suspend();
		Thread.sleep(2000);
		
		System.out.println("Resuming group A..");
		grpA.resume();
		
		//waiting for the threads to end
//		((Thread) thdi1.t).join();
//		((Thread) thdi2.t).join();
		
		System.out.println("Main thread exiting...");
	}
}
