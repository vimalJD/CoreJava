//it shows shadinga row

package com.swing;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

public class ShadingRows {

	public ShadingRows() {

		JFrame frame = new JFrame("Shading rows in JTable");
		JPanel panel = new JPanel();

		String data[][] = { { "Vinod", "100", "MCA", "Computer" }, { "Deepak", "101", "PGDCA", "History" },
				{ "Ranjan", "102", "M.Sc", "Biology" }, { "Radha", "103", "BCA", "Computer" }, };

		String col[] = { "Name", "Roll", "Course", "Subject" };

		DefaultTableModel model = new DefaultTableModel(data, col);

		// setting the shading in rows

		JTable table = new JTable(model) {
			public Component prepareRender(TableCellRenderer renderer, int index_row, int index_col) {

				Component comp = super.prepareRenderer(renderer, index_row, index_col);

				// even index, selected ornot selected
				if (index_row % 2 == 0 && !isCellSelected(index_row, index_col)) {

					comp.setBackground(Color.lightGray);
				} else {
					comp.setBackground(Color.white);
				}
				return comp;
			}
		};

		JTableHeader header = table.getTableHeader();
		header.setBackground(Color.yellow);

		JScrollPane pane = new JScrollPane(table);

		panel.add(pane);
		frame.add(panel);
		frame.setSize(460, 200);
		frame.setUndecorated(true);
		frame.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new ShadingRows();
	}
}
