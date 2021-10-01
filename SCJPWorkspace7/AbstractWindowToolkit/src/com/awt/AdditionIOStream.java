package com.awt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdditionIOStream {

	public static void main(String[] args) {

		try {

			// connecting to keyboard
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			// reading data from keyboard
			System.out.println("Enter first Integer number: ");
			String fno = br.readLine();

			System.out.println("Enter second Integer number: ");
			String sno = br.readLine();

			// converting numbers from String form to int form
			int i = Integer.parseInt(fno);
			int j = Integer.parseInt(sno);

			// adding two numbers
			int k = i + j;
			System.out.println("Result: " + k);

		} catch (NumberFormatException nfe) {
			// TODO: handle exception
			System.out.println("Please pass only integer numbers");
		} catch (IOException ioe) {
			// TODO: handle exception
			ioe.printStackTrace();
		}
	}
}
