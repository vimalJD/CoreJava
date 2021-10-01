
// Java program to illustrate yield() method 
// in Java 
package multi.controlling.threadsexecution;

public class MyThread2 extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++)
			System.out.println(Thread.currentThread().getName() + " in control");
	}
}
