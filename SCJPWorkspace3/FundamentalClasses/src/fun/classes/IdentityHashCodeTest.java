package fun.classes;

class Example2 {

	private int x;

	Example2(int x) {
		this.x = x;
	}

	@Override
	public int hashCode() {
		return x;
	}

	public int JVMHC() {
		return super.hashCode();

	}
};

public class IdentityHashCodeTest {

	public static void main(String[] args) {

		Example2 e = new Example2(5);
		Example2 e1 = new Example2(5);
		Example2 e2 = new Example2(6);

		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println();

		System.out.println(System.identityHashCode(e));
		System.out.println(System.identityHashCode(e1));
		System.out.println(System.identityHashCode(e2));
		System.out.println();

		System.out.println(e.JVMHC());
		System.out.println(e1.JVMHC());
		System.out.println(e2.JVMHC());

	}
}
