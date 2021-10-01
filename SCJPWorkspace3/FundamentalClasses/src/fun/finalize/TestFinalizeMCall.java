package fun.finalize;

public class TestFinalizeMCall {

	public static void main(String[] args) throws Exception {

		Building building = new Building(new Furniture());
		System.out.println(building);
		System.out.println(building.furniture);
		System.out.println(building.furniture.cost);

		building.finalize();

		System.out.println(building);
		System.out.println(building.furniture);
		System.out.println(building.furniture.cost);
	}
}
