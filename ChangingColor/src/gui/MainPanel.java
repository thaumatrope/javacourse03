package gui;

import java.awt.Color;

import javax.swing.JPanel;

public class MainPanel extends JPanel {
	
	public MainPanel() {
		this.setBackground(Color.green);
	}

	public void changeColor(Color color) {
		setBackground(color);
	}
}
