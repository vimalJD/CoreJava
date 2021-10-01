//LifeCycle of applet 
package com.applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class LifeCycle extends Applet{

	int inits,starts,stops,paints;
	
	@Override
	public void init() {
		inits++;
		System.out.println("Applet is initialized");
	}
	
	@Override
	public void start() {
		starts++;
		System.out.println("Applet is started");
	}
	
	@Override
	public void stop() {
		stops++;
		System.out.println("Applet is stopped");
	}
	
	@Override
	public void paint(Graphics g) {
		
		String msg = "init()="+inits+"\n"+
					"start()="+starts+"\n"+
					"stop()="+stops+"\n"+
					"paint()="+paints;
		
		setBackground(Color.yellow);
		Font f= new Font("Courier New", Font.BOLD, 25);
		g.setFont(f);
		g.setColor(Color.red);
		g.drawString(msg, 50, 50);
		
		paints++;
		System.out.println("Applet paint is called");
		
	}
	
	@Override
	public void destroy() {
		
		System.out.println("Applet is destroyed");
	}
	
	//LifeCycle.html
	
	/*<applet code="LifeCycle" width="750" height="500">
	</applet>*/

}
