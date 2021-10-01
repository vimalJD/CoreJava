package interfaceuseas.multipleclass;

public class Driver {

	public static void main(String[] args) {

		Vehicle v;

		v = new RedBus();
		v.engine();
		v.breaks();

		v = new Volvo();
		v.engine();
		v.breaks();

	}
}
