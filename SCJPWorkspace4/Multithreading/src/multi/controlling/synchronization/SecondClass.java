package multi.controlling.synchronization;

public class SecondClass {

	synchronized void secondClassMethod(FirstClass fc) {

		String name = Thread.currentThread().getName();
		
		System.out.println(name+" entered into sc.secondClassMethod()");
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {

			e.printStackTrace();
		}

		System.out.println(name+" is trying to call fc.lastMethod()");
		
		fc.lastMethod();
	}
	
	synchronized void lastMethod() {
		System.out.println("Inside sc.lastMethod()");
	}

}
