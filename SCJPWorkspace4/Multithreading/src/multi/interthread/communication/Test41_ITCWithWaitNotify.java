package multi.interthread.communication;

public class Test41_ITCWithWaitNotify {

	public static void main(String[] args) {

		Factory bajaj = new Factory();

		new Producer(bajaj);
		new Consumer(bajaj);
	}
}
