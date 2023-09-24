package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;

class ColorButtonListener implements ActionListener {
	
	private ColorChangeListener colorChanger;
	private Color color;
	
	public ColorButtonListener() {
		super();
	}

	public ColorButtonListener(ColorChangeListener colorChanger, Color color) {
		super();
		this.colorChanger = colorChanger;
		this.color = color;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(this.color + " button clicked");
		colorChanger.changeColor(this.color);
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
		
		redButton.addActionListener(new ColorButtonListener());
		blueButton.addActionListener(new ColorButtonListener());
		
		add(redButton);
		add(blueButton);
	}
	
	public Toolbar(ColorChangeListener colorChanger) {
		
		final JButton redButton = new JButton("Red");
		final JButton blueButton = new JButton("Blue");
		
		redButton.addActionListener(new ColorButtonListener(colorChanger, Color.red));
		blueButton.addActionListener(new ColorButtonListener(colorChanger, Color.blue));
		
		
		add(redButton);
		add(blueButton);
	}

}
