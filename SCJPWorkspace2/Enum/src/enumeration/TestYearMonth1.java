package enumeration;

public class TestYearMonth1 {

	public static void main(String[] args) {

		Month1[] menuItems = Month1.values();

		for (Month1 menuItem : menuItems) {

			System.out.print(menuItem.getNum() + ".");
			System.out.println(menuItem.name());
		}
	}
}
