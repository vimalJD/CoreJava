//it shows setting header for column, it means drag to slide both side.

package com.swing;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class SetColumnHeader {

	public SetColumnHeader() {

		JFrame frame = new JFrame("Setting the column header");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();

		String data[][] = { { "100", "Vinod", "programmer", "5000" }, { "101", "Deepak", "Content writer", "20000" },
				{ "102", "Noor", "Technical writer", "30000" }, { "104", "Rinku", "PHP programmer", "25000" },

		};

		String col[] = { "Emap_Id", "Emp_name", "Emp_depart", "Emp_sal" };
		DefaultTableModel model = new DefaultTableModel(data, col);

		JTable table = new JTable(model);
		JTableHeader header = table.getTableHeader();
		header.setBackground(Color.yellow);

		JScrollPane pane = new JScrollPane(table);
		panel.add(pane);
		frame.add(panel);
		frame.setUndecorated(true);
		frame.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
		frame.setSize(460, 200);
		frame.setVisible(true);

	}

	public static void main(String[] args) {

		new SetColumnHeader();
	}
}
