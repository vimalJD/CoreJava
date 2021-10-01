package fun.finalize;

public class Building {

	Furniture furniture;

	public Building(Furniture furniture) {
		this.furniture = furniture;
	}

	// why do not need throws?
	@Override
	public void finalize() {

		System.out.println("In finalize method" );
		furniture = null;
	}

}
