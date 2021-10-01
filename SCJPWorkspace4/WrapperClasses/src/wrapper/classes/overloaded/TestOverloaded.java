package wrapper.classes.overloaded;

public class TestOverloaded {

	public static void main(String[] args) {

		Sample s = new Sample();
		s.m1(10);
		s.m1(new Integer(10));

		Example e = new Sample();
		e.m1(10);
		e.m1(new Integer(10));

		e.m1(new Integer(10).intValue());
	}
}
