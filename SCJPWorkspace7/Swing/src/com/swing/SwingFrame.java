//this application shows creation of a frame anf button using swing components

package com.swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingFrame extends JFrame {

	public SwingFrame() {
		
		JButton b = new JButton("Button");
		add(b);
		
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SwingFrame();
	}

}
