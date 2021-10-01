package interface1.looslycouple;

public class Rabbit implements Animal {

	@Override
	public void eat() {
		System.out.println("Rabbit, eat veg");

	}

	@Override
	public void sleep() {
		System.out.println("Rabbit, sleep in bushes");

	}

}
