package interface1.looslycouple;

public class Lion implements Animal {

	@Override
	public void eat() {
		System.out.println("Lion, eat non-veg");
	}

	@Override
	public void sleep() {
		System.out.println("Lion, sleep in caves");
	}

}
