//it shows remove row from a table 8? 

package com.swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Removerows {

	public Removerows() {

		JFrame frame = new JFrame("Inserting row in table");

		JPanel panel = new JPanel();

		String data[][] = { { "vinod", "100" }, { "Raju", "200" }, { "Ranju", "300" }, { "Rahul", "400" },
				{ "Noor", "600" } };

		String col[] = { "Nmae", "Code" };

		DefaultTableModel model = new DefaultTableModel(data, col);
		JTable table = new JTable(model);

		System.out.println("Befor removing number of rows: " + model.getRowCount());

		// Remove first row
		model.removeRow(0);
		System.out.println("After removing first row, number of rows: " + model.getRowCount());

		// Remove last row
		model.removeRow(table.getRowCount() - 1);
		System.out.println("After removing last row, number of rows: " + table.getRowCount());

		panel.add(table);
		frame.add(panel);
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Removerows();
	}
}
