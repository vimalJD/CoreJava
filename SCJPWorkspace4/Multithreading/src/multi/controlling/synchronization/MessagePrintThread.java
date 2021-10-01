package multi.controlling.synchronization;

public class MessagePrintThread implements Runnable {

	String msg;
	PrintMessage pm;
	Thread th;

	public MessagePrintThread(PrintMessage pm, String msg) {

		this.pm = pm;
		this.msg = msg;
		
		th = new Thread(this);
		th.start();
	}

	@Override
	public void run() {
		pm.printMsg(msg);
	}

}
