package com.swing.clock;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Random;

public class Dice extends JApplet {
	/** Applet initialization requires putting the panel in applet. */
	public Dice() {
		this.setContentPane(new RollDicePanel());
	}// end constructor
//====================================================== method main

	/** Create JFrame and set content pane to a RollDicePanel. */
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setTitle("Dice Demo");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setContentPane(new RollDicePanel());
		window.pack();
		window.show();
	}// end main
}

class RollDicePanel extends JPanel {
//=============================================== instance variables
	private Die _left; // component for one die
	private Die _right;

//end instance variables
//====================================================== constructor
	/** Create border layout panel with two Die's and one button. */
	RollDicePanel() {
//--- Create the dice
		_left = new Die();
		_right = new Die();
//--- Create the button to roll the dice
		JButton rollButton = new JButton("Roll");
		rollButton.setFont(new Font("Sansserif", Font.PLAIN, 24));
		rollButton.addActionListener(new RollListener());
//--- Create panel for two dice
		JPanel dicePanel = new JPanel();
		dicePanel.setLayout(new GridLayout(1, 2, 4, 0));
		dicePanel.add(_left);
		dicePanel.add(_right);
//--- Add components to content pane
		this.setLayout(new BorderLayout());
		this.add(rollButton, BorderLayout.NORTH);
		this.add(dicePanel, BorderLayout.CENTER);
	}// end constructor
/////////////////////////////////// inner listener class RollListener

	/** Inner listener class for Roll button. */
	private class RollListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			_left.roll();
			_right.roll();
		}
	}
}

class Die extends JPanel {
//=============================================== instance variables
	private int _value; // value that shows on face of die
	private int _diam = 9; // Diameter of spots
//end instance variables
//=============================================== class variables
	private static Random random = new Random(); // random generator
//end class variables
//====================================================== constructor

	/** Initialize to white background and 60x60 pixels. Initial roll. */
	public Die() {
		setBackground(Color.white);
//-- Preferred size is set, but layout may change it.
		setPreferredSize(new Dimension(60, 60));
		roll(); // Set to random initial value
	}// end constructor
//====================================================== method roll

	/**
	 * Produce random roll in range 1-6. Causes repaint().
	 * 
	 * @return Result of roll (1-6).
	 */
	public int roll() {
		int val = random.nextInt(6) + 1; // Range 1-6
		setValue(val);
		return val;
	}// end roll
//================================================== method getValue

	/** Returns result of last roll. */
	public int getValue() {
		return _value;
	}// end setValue
//================================================== method setValue

	/**
	 * Sets the value of the Die. Causes repaint().
	 * 
	 * @param spots Number from 1-6.
	 */
	public void setValue(int spots) {
		_value = spots;
		repaint(); // Value has changed, must repaint
	}// end setValue
//============================================ method paintComponent

	/** Draws spots of die face. */
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // required
		int w = getWidth();
		int h = getHeight(); // should use to resize spots too.
		switch (_value) {
		case 1:
			drawSpot(g, w / 2, h / 2);
			break;
		case 3:
			drawSpot(g, w / 2, h / 2);
// Fall thru to next case
		case 2:
			drawSpot(g, w / 4, h / 4);
			drawSpot(g, 3 * w / 4, 3 * h / 4);
			break;
		case 5:
			drawSpot(g, w / 2, h / 2);
// Fall thru to next case
		case 4:
			drawSpot(g, w / 4, h / 4);
			drawSpot(g, 3 * w / 4, 3 * h / 4);
			drawSpot(g, 3 * w / 4, h / 4);
			drawSpot(g, w / 4, 3 * h / 4);
			break;
		case 6:
			drawSpot(g, w / 4, h / 4);
			drawSpot(g, 3 * w / 4, 3 * h / 4);
			drawSpot(g, 3 * w / 4, h / 4);
			drawSpot(g, w / 4, 3 * h / 4);
			drawSpot(g, w / 4, h / 2);
			drawSpot(g, 3 * w / 4, h / 2);
			break;
		}
	}// end paintComponent

	/** Utility method used by paintComponent(). */
//================================================== method drawSpot
	private void drawSpot(Graphics g, int x, int y) {
		g.fillOval(x - _diam / 2, y - _diam / 2, _diam, _diam);
	}// end drawSpot
}//
