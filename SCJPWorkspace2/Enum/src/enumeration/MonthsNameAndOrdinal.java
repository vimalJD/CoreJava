package enumeration;

public class MonthsNameAndOrdinal {

	public static void main(String[] args) {

		Month[] months = Month.values();

		for (Month month : months) {

			System.out.print(month.ordinal() + 1 + ".");
			System.out.println(month.name());
		}
	}
}
