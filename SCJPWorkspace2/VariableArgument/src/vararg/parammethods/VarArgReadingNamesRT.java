
//did not run

package vararg.parammethods;

import java.util.Scanner;

class NamesPrinter {

	static void print(String... names) {

		System.out.println(names.length + " names are passed");
		System.out.println("They are");

		for (String name : names) {
			System.out.println(" " + name);
		}
	}
}

public class VarArgReadingNamesRT {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter names with space separator");
		String input = scn.nextLine();

		if (input.isEmpty()) {
			NamesPrinter.print();
		} else {
			String[] names = input.split("");
			NamesPrinter.print(names);
		}
	}
}
