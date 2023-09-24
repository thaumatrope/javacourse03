package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;

class ColorButtonListener implements ActionListener {
	
	private MainPanel panel;
	private Color color;
	
	public ColorButtonListener() {
		super();
	}

	public ColorButtonListener(MainPanel panel, Color color) {
		super();
		this.panel = panel;
		this.color = color;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(this.color + " button clicked");
		panel.changeColor(this.color);
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
	
	public Toolbar(MainPanel panel) {
		
		final JButton redButton = new JButton("Red");
		final JButton blueButton = new JButton("Blue");
		
		redButton.addActionListener(new ColorButtonListener(panel, Color.red));
		blueButton.addActionListener(new ColorButtonListener(panel, Color.blue));
		
		
		add(redButton);
		add(blueButton);
	}

}
