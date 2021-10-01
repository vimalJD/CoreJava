package vararg.parammethods;

import java.util.Scanner;

class A {

	void m1(int... ia) {
		System.out.println(ia.length + " Values are passed");

		for (int i : ia) {
			System.out.println(" " + i);
		}
	}
}

public class VarArgRTvaluesTest {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter numbers with space separator: ");

		String input = scn.nextLine();

		int[] iNums = null;

		if (input.isEmpty()) {
			iNums = new int[0];
		}

		else {
			// Splitting given string into individual numbers
			String[] sNums = input.split("");

			// Creating array with size equal to given nums
			iNums = new int[sNums.length];

			if (sNums.length != 0) {

				// Copying nums from sNum to iNums array
				// by converting numbers from String form to int form
				for (int i = 0; i < sNums.length; i++) {

					iNums[i] = Integer.parseInt(sNums[i]);
				}

			}
		}

		// Invoking var-arg method by passing array with '0 - n' numbers of values
		A a = new A();
		a.m1(iNums);

	}
}
