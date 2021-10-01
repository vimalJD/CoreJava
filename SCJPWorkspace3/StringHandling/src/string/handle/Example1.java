package string.handle;

public class Example1 {

	int x;

	public Example1(int x) {
		this.x = x;
	}

	@Override
	public int hashCode() {

		return x;
	}
}
