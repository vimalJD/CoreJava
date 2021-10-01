//this approach we called all three methods on frame object reference variable,
//there is a bit redundant code that is we use referenced variable all three times.

package com.awt;

import java.awt.Frame;

public class FrameDemo {

	public static void main(String[] args) {

		Frame f = new Frame();
//		System.out.println("Frame object is created");

		f.setTitle("Addition window");
		f.setSize(500, 500);
		f.setVisible(true);

	}
}
