package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class Toolbar extends JToolBar{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5707394191276063225L;
	private ColorChangeListener colorChanger;

	public Toolbar() {
		
		final JButton redButton = new JButton("Red");
		final JButton blueButton = new JButton("Blue");
		
		redButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				colorChanger.changeColor(Color.red);
			}			
		});
		blueButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				colorChanger.changeColor(Color.blue);
			}		
		});
		
		add(redButton);
		add(blueButton);
	}
	
	
	/**
	 * @return the colorChanger
	 */
	public ColorChangeListener getColorChanger() {
		return colorChanger;
	}

	/**
	 * @param colorChanger the colorChanger to set
	 */
	public void setColorChanger(ColorChangeListener colorChanger) {
		this.colorChanger = colorChanger;
	}

}
