//this program demonstrates creating a window with menus

package com.awt.custom;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;

public class JavaEditor extends Frame implements ActionListener {

	TextArea ta;
	FileDialog dlg;
	Font f;
	String strFileName, str;

	MenuBar mb;
	Menu mFile, mFormat, msubColor, msubStyle;
	MenuItem miNew, miOpen, miSave, miExit;
	MenuItem miPink, miOrange, miGray, miPlain, miBold, miItalic;

	public JavaEditor() {

		setBackground(Color.pink);
		setForeground(Color.black);
		setTitle("Menu Demo");

		f = new Font("Arial", Font.PLAIN, 12);
		setFont(f);

		mb = new MenuBar();

		mFile = new Menu("File");
		mFormat = new Menu("Format");
		msubColor = new Menu("Color");
		msubStyle = new Menu("Style");

		miNew = new MenuItem("New");
		miNew.addActionListener(this);

		miOpen = new MenuItem("Open");
		miOpen.addActionListener(this);

		miSave = new MenuItem("Save");
		miSave.addActionListener(this);

		miExit = new MenuItem("Exit");
		miExit.addActionListener(this);

		miPink = new MenuItem("Pink");
		miPink.addActionListener(this);

		miOrange = new MenuItem("Orange");
		miOrange.addActionListener(this);

		miGray = new MenuItem("Gray");
		miGray.addActionListener(this);

		miPlain = new MenuItem("Plain");
		miPlain.addActionListener(this);

		miBold = new MenuItem("Bold");
		miBold.addActionListener(this);

		miItalic = new MenuItem("Italic");
		miItalic.addActionListener(this);

		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(miSave);
		mFile.add(miExit);

		mFormat.add(msubColor);
		mFormat.add(msubStyle);

		msubColor.add(miPink);
		msubColor.add(miOrange);
		msubColor.add(miGray);

		msubStyle.add(miPlain);
		msubStyle.add(miBold);
		msubStyle.add(miItalic);

		mb.add(mFile);
		mb.add(mFormat);

		setMenuBar(mb);

		ta = new TextArea();
		add(ta);

		setSize(400, 400);
		show();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == miNew) {

			ta.setText("");
		}

		if (ae.getSource() == miOpen) {

			dlg = new FileDialog(this, "Open", FileDialog.LOAD);
			dlg.show();
			try {

				strFileName = dlg.getDirectory() + "\\" + dlg.getFile();
				FileReader fr = new FileReader(strFileName);
				BufferedReader br = new BufferedReader(fr);
				ta.setText("");

				while ((str = br.readLine()) != null) {

					ta.append(str + "\n");
				}
			} catch (Exception e) {
				System.out.println("Exception: " + e);
			}
		}

		if (ae.getSource() == miSave) {

			dlg = new FileDialog(this, "Save", FileDialog.SAVE);
			dlg.show();

			try {

				strFileName = dlg.getDirectory() + "\\" + dlg.getFile();

				FileOutputStream fos = new FileOutputStream(strFileName);

				byte[] b = ta.getText().getBytes();

				fos.write(b);

			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		if (ae.getSource() == miExit) {
			System.exit(0);
		}

		if (ae.getSource() == miPink) {
			ta.setBackground(Color.pink);
		}

		if (ae.getSource() == miOrange) {
			ta.setBackground(Color.orange);
		}

		if (ae.getSource() == miGray) {
			ta.setBackground(Color.lightGray);
		}

		if (ae.getSource() == miPlain) {
			f = new Font("Arial", Font.PLAIN, 12);
			ta.setFont(f);
		}

		if (ae.getSource() == miBold) {

			f = new Font("Arial", Font.BOLD, 12);
			ta.setFont(f);
		}

		if (ae.getSource() == miItalic) {

			f = new Font("Arial", Font.ITALIC, 12);
			ta.setFont(f);
		}
	}

	public static void main(String[] args) {

		new JavaEditor();
	}

}
