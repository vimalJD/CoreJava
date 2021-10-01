//Calculator.java

import java.util.*;

public class TestCalc {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int i1= scn.nextInt();
		
		System.out.println("Enter the second number");
		int i2= scn.nextInt();
		
		Addition.add(i1,i2);
	}
}
