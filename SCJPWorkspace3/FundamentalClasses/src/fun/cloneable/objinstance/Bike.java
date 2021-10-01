package fun.cloneable.objinstance;

public class Bike implements Cloneable {

	private int engineNumber;
	private int modelNumber;
	private String type;
	private int bikeNumber;

	public Bike(int engineNumber, int modelNumber, String type) {
		this.engineNumber = engineNumber;
		this.modelNumber = modelNumber;
		this.type = type;
	}

	public void setBikeNumber(int bikeNumber) {
		this.bikeNumber = bikeNumber;
	}

	// overriding clone method
	@Override
	public Bike clone() throws CloneNotSupportedException {

		Bike newBike = (Bike) super.clone();
		newBike.engineNumber = this.engineNumber + 10;
		return newBike;
	}

	@Override
	public String toString() {
		return "Bike [engineNumber=" + engineNumber + "\n" + " modelNumber=" + modelNumber + "\n" + " type=" + type
				+ "\n" + " bikeNumber=" + bikeNumber + "]\n";
	}

}
