package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;

class RedButtonListener implements ActionListener {
	
	MainPanel panel;
	
	public RedButtonListener() {
		super();
	}

	public RedButtonListener(MainPanel panel) {
		super();
		this.panel = panel;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Red button clicked");
		panel.changeColor(Color.RED);
	}

	
}

class BlueButtonListener implements ActionListener {
	
	MainPanel panel;
	
	public BlueButtonListener() {
		super();
	}
	
	public BlueButtonListener(MainPanel panel) {
		super();
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Blue button clicked");
		panel.changeColor(Color.BLUE);

	}

	
}

public class Toolbar extends JToolBar{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5707394191276063225L;

	public Toolbar() {
		
		final JButton redButton = new JButton("Red");
		final JButton blueButton = new JButton("Blue");
		
		redButton.addActionListener(new RedButtonListener());
		blueButton.addActionListener(new BlueButtonListener());
		
		add(redButton);
		add(blueButton);
	}
	
	public Toolbar(MainPanel panel) {
		
		final JButton redButton = new JButton("Red");
		final JButton blueButton = new JButton("Blue");
		
		redButton.addActionListener(new RedButtonListener(panel));
		blueButton.addActionListener(new BlueButtonListener(panel));
		
		add(redButton);
		add(blueButton);
	}

}
