package inherit1;

public class P {
	void m1() {

	}

	class Q extends P {

	}

	interface I5 {
		void m1();
	}

	interface I6 extends I5 {

	}

	/*
	 * public class R implements I5 {
	 * 
	 * 
	 * }
	 */

	public class S implements I5 {

		@Override
		public void m1() {
			// TODO Auto-generated method stub

		}

	}

	public abstract class U {

		abstract void m1();

		void m2() {

		}
	}

	/*
	 * class V extends U {
	 * 
	 * }
	 */

	class W extends U {

		@Override
		void m1() {
			// TODO Auto-generated method stub

		}

		/*
		 * void m2() {
		 * 
		 * }
		 */

	}

	final class X {

	}

	/*
	 * class y extends X {
	 * 
	 * }
	 */
}
