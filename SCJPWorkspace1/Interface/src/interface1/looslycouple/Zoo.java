package interface1.looslycouple;

public class Zoo {

	// loosely couple object of super class
	public static void sendAnimal(Animal a) {

		a.eat();
		a.sleep();
	}
}
