package string.handle;

public class Example {

	int x;

	public Example(int x) {
		this.x = x;
	}
	
	public boolean equals(Object obj) {
		
		if (obj instanceof Example) {
			
			Example e = (Example) obj;
			return (this.x==e.x);
		}
		return false;
		
	}
}
