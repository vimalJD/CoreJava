//creating a custom dialog

package com.awt.custom;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

public class MyDialog extends Dialog {

	Button b;
	Font f;

	public MyDialog(Frame frm, String name) {
		super(frm, name, true);

		setBounds(50, 150, 220, 100);
		setForeground(Color.blue);
		setLayout(new FlowLayout());

		f = new Font("Arial", Font.BOLD, 12);
		setFont(f);

		b = new Button("Close");
		add(b);
	}

	@Override
	public void paint(Graphics g) {
		g.drawString("This is a custom dialog box", 30, 80);
	}

//	public static void main(String[] args) {
//		new MyDialog(null, null);
//	}
}
