package com.vimal.logic;

/**
 * This class is meant for adding two integers and for concatenating two
 * strings. Author: Vimal Patel
 */
public class Addition {

	private int a;
	private int b;
	private String s1;
	private String s2;

	/**
	 * This method takes two int numbers and returns their addition result.
	 */
	public int add(int a, int b) {
		return a + b;

	}

	/**
	 * This method takes two strings and returns their concatenation result.
	 */

	String add(String s1, String s2) {
		return s1 + s2;

	}

	public static void main(String[] args) {

		Addition a = new Addition();
		a.add(2, 3);
		System.out.println(a);
		a.add(5, 6);
		System.out.println(a);
	}
}
