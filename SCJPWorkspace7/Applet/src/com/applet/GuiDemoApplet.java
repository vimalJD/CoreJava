//GuiDemoApplet

package com.applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiDemoApplet extends Applet implements ActionListener{

	Button b1,b2;
	TextField tf1,tf2,tf3;
	Label l1,l2,l3;
	Toolkit tk;
	
	@Override
	public void init() {
	
		setLayout(new GridLayout(4, 2, 10, 10));
		
		setFont(new Font("Arial", Font.BOLD, 25));
		setBackground(Color.CYAN);
		setForeground(Color.RED);
		
		l1=new Label("Enter first int number");
		l2= new Label("Enter second int number");
		l3= new Label("Result ");
		
		tf1=new TextField(20);
		tf2=new TextField(20);
		tf3=new TextField(20);
		
		b1 = new Button("Add");
		b2= new Button("Clear");
		
		add(l1);
		add(tf1);
		
		add(l2);
		add(tf2);
		
		add(l3);
		add(tf3);
		
		add(b1);
		add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if (ae.getActionCommand().equals("Add")) {
			
			int a = Integer.parseInt(tf1.getText());
			int b = Integer.parseInt(tf2.getText());
			int c= a+b;
			
			tf3.setText(""+c);
		}
		else if (ae.getSource()==b2) {
			
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
		}
	}
}

//GuiDemoApplet.html

/*<applet code="GuiDemoApplet" width="750" height="500">
</applet>*/