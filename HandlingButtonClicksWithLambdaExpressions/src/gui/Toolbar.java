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
		
//		redButton.addActionListener((e) -> {
//			colorChanger.changeColor(Color.red);
//		});
		
		// Anonymous class with only ONE function can be substituted by lambda expression
		redButton.addActionListener(e -> colorChanger.changeColor(Color.red));
		blueButton.addActionListener(e -> colorChanger.changeColor(Color.blue));
		
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
