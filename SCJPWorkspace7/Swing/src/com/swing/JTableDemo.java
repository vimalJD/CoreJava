//This application shows creation of JTable

package com.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

public class JTableDemo {

	public JTableDemo() {

		JFrame frame = new JFrame("JTable Demo");

		String[][] rowsData = { { "vimal", "java developer" }, { "vimal", "Internship" } };

		String[] columns = { "Student Name", "Status" };

		JTable table = new JTable(rowsData, columns);
		JPanel panel = new JPanel();

		panel.add(table, BorderLayout.CENTER);
		frame.add(panel);

		frame.setSize(450, 350);
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {

		new JTableDemo();
	}
}
