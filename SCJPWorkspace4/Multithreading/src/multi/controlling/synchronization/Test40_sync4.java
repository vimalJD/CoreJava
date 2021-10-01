package multi.controlling.synchronization;

public class Test40_sync4 {

	public static void main(String[] args) {

		PrintMessage pm = new PrintMessage();

		MessagePrintThread mpt = new MessagePrintThread(pm, "Hi");
		MessagePrintThread mpt1 = new MessagePrintThread(pm, "Hello");
		MessagePrintThread mpt2 = new MessagePrintThread(pm, "HRU");
	}
}
