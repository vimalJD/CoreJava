package fun.cloneable.objinstance;

public class Factory {

	public static void main(String[] args) throws CloneNotSupportedException {

		Bike bike1 = new Bike(12345, 2012, "Splender 108cc");
		Bike bike2 = (Bike) bike1.clone();

		System.out.println(bike1 == bike2);

		bike1.setBikeNumber(8192);
		bike2.setBikeNumber(8193);

		System.out.println("bike1 object details");
		System.out.println(bike1);

		System.out.println();
		System.out.println("bike2 object details");
		System.out.println(bike2);
	}
}
