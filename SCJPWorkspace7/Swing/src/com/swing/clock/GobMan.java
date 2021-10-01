package com.swing.clock;

import javax.swing.*;
import java.awt.*;
import javax.swing.*;

public class GobMan {
	public static void main(String[] args) {
		JFrame window = new FaceWindow();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}// end main
}// end class Face

class FaceWindow extends JFrame {
// ==================================================== constructor
	FaceWindow() {
		Container content = this.getContentPane(); // get content pane
		content.setLayout(new BorderLayout()); // set its layout
		Man drawing = new Man(); // Create a Man
		content.add(drawing, BorderLayout.CENTER); // center expands
		this.setTitle("Mr GobMan");
		this.pack(); // finalize window layout
	}// end constructor
}

class Man extends JPanel {
// =================================================== constructor
	Man() {
		this.setBackground(Color.lightGray);
		this.setPreferredSize(new Dimension(400, 400)); // size
	}// end constructor
//===========================================//===== paintComponent

	public void paintComponent(Graphics g) {
// This method is called to redraw window
		super.paintComponent(g); // MUST be first line
//--- Draw the head with open mouth and 8 pixel border
		g.setColor(Color.green);
		g.fillArc(8, 8, 384, 384, 30, 300);
//--- Draw the eye
		g.setColor(Color.blue);
		g.fillOval(230, 72, 60, 60);
	}// end paintComponent
}//
