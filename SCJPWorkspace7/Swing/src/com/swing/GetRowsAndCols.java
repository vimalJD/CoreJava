//it shows getting column data

package com.swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

public class GetRowsAndCols {

	public GetRowsAndCols() {
		
		JFrame frame = new JFrame("Getting the rows and columns from a table");	
		JPanel panel = new JPanel();

		String data[][] = { { "Vinod", "5000","java"  }, { "Deepak", "14000" ,"developer"},
				{ "sushil", "20000" ,"writer"}, { "Chandan", "15000","Programmer" },

		};

		String col[] = { "Emp_name", "Emp_sal" ,"Depart"};
		
		JTable table= new JTable(data,col);
		int ncol = table.getColumnCount();
		System.out.println("Numbers of columns: "+ncol);
		System.out.println("Numbers of rows: "+table.getRowCount());
		System.out.println("Nmae of columns");
		for (int i = 0; i < ncol; i++) {
			
			System.out.println(col[i]);
		}

		panel.add(table);
		frame.add(panel);
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		new GetRowsAndCols();
	}
}
