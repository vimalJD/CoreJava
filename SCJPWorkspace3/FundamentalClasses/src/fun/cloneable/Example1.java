package fun.cloneable;

public class Example1 implements Cloneable {

	public Example1 clone() throws CloneNotSupportedException {

		return (Example1) super.clone();
	}
}
