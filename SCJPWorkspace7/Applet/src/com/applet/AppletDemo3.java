//It demonstrates displaying a message in the status bar usibg applet

package com.applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class AppletDemo3 extends Applet {

	Font f;

	@Override
	public void init() {

		setBackground(Color.pink);
		setForeground(Color.blue);

		f = new Font("Arial", Font.BOLD, 20);
		setFont(f);
	}

	@Override
	public void paint(Graphics g) {

		g.drawString("Welcome to the world of Applets", 50, 100);
		g.setColor(Color.yellow);
		g.drawString("Please see the message in the status bar", 8, 120);
		showStatus("This is shown in the status window.");
	}
}

/*
 * <applet code="AppletDemo3" width="400" height="200"> </applet>
 */