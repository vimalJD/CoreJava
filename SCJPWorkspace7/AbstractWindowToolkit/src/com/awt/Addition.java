package com.awt;

public class Addition {

	public static void main(String[] args) {

		try {

			int i = Integer.parseInt(args[0]);
			int j = Integer.parseInt(args[1]);

			int k = i + j;
			System.out.println("Result: " + k);

		} catch (ArrayIndexOutOfBoundsException aioob) {
			// TODO: handle exception
			System.out.println("Wrong execution, please input atleast two integer values with space separator");

			System.out.println("Usage: java Addition 5 6");
		} catch (NumberFormatException nfe) {
			// TODO: handle exception
			System.out.println("Please input only integer number");
		}
	}
}
