//This application shows creating dialog window using java application.

package com.awt.custom;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogDemo extends Frame implements ActionListener {

	MyDialog dlg;
	Button b1;
	Font f;

	public DialogDemo() {

		setBackground(Color.pink);
		setForeground(Color.blue);
		setTitle("Dialog Demo");
		setLayout(new FlowLayout());

		f = new Font("Arial", Font.BOLD, 12);
		setFont(f);

		dlg = new MyDialog(this, "Dialog Box");

		b1 = new Button("Show Dialog");
		b1.addActionListener(this);

		dlg.b.addActionListener(this);

		add(b1);

		setSize(300, 300);
		show();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub

		if (ae.getSource() == b1) {

			dlg.show();
		}
		if (ae.getSource() == dlg.b) {
			dlg.dispose();
		}

	}

	public static void main(String[] args) {

		new DialogDemo();
	}

}
