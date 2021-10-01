//in this approach we called the same three methods in constructor without using 
//any three referenced variable ("this" keyword use internally)

package com.awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends Frame implements ActionListener {

	Label l1, l2, l3;
	TextField tf1, tf2, tf3;
	Button b1, b2;

	public MyFrame() {

		// Creating component objects
		l1 = new Label("Enter first integer number");
		l2 = new Label("Enter second integer number");
		l3 = new Label("Result");

		tf1 = new TextField(20);
		tf2 = new TextField(20);
		tf3 = new TextField(20);

		b1 = new Button("Add");
		b2 = new Button("Clear");

		// adding components to container
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);

		add(l3);
		add(tf3);

		add(b1);
		add(b2);

		// registering event handling class object
		b1.addActionListener(this);
		b2.addActionListener(this);

		// setting fonts and colors
		setFont(new Font("Arial", Font.BOLD, 24));

		setBackground(Color.CYAN);
		setForeground(Color.BLUE);

		// Setting flow layout
		setLayout(new FlowLayout());

		// setting frame object properties

		setTitle("Addition window");
		setSize(500, 500);
		setVisible(true);

	}

	// Event handling logig
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub

		// returns button name that has been clicked by end-user
		String buttonName = ae.getActionCommand();

		if (buttonName.equals("Add")) {

			// reading textFields data;
			String s1 = tf1.getText();
			String s2 = tf2.getText();

			// converting string form into int form
			int n1 = Integer.parseInt(s1);
			int n2 = Integer.parseInt(s2);

			// adding given two numbers
			int n3 = n1 + n2;

			// converting into form to string form and
			// setting result to result text field
			tf3.setText("" + n3);

		} else if (buttonName.equals("Clear")) {

			// setting text field with empty field
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
		}
	}

	public static void main(String[] args) {

		MyFrame f = new MyFrame();
//		System.out.println("Frame object is created");

	}

}
