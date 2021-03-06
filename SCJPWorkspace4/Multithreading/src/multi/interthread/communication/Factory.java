package multi.interthread.communication;

public class Factory {

	int items;
	boolean itemsInFactory;

	synchronized void produce(int items) {

		if (itemsInFactory) {

			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		this.items = items;
		itemsInFactory = true;

		System.out.println("produced items: " + items);

		notify();
		// produce end
	}

	synchronized int consumer() {

		if (!itemsInFactory) {

			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("items consumed: " + items);
		itemsInFactory = false;

		notifyAll();
		return items;
	}
}
