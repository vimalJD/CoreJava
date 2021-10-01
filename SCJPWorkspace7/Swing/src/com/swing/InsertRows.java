//Inserting row in table

package com.swing;

import java.awt.Frame;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class InsertRows {

	public InsertRows() {

		JFrame frame = new JFrame("Inserting rows in table!");
		JPanel panel = new JPanel();

		String data[][] = { { "Vinod", "100" }, { "Raju", "200" }, { "Ranju", "300" } };

		String col[] = { "Name", "code" };

		DefaultTableModel model = new DefaultTableModel(data, col);

		JTable table = new JTable(model);

		// inserting first position
		model.insertRow(0, new Object[] { "Ranjan", "50" });

		// inserting 4th position
		model.insertRow(3, new Object[] { "Amar", "600" });

		// inserting last position
		model.insertRow(table.getRowCount(), new Object[] { "Sushil", "600" });

		panel.add(table);
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new InsertRows();
	}
}
