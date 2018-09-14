package com.codiella.citydefenders.window;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Window extends JFrame{
	
	public static void main(String args[]) {
		JFrame frame = new JFrame("CityDefenders v0.1");
		frame.setVisible(true);
		frame.setSize(1000, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
	}	

	
}


