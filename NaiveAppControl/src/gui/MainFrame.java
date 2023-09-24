package gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainFrame(String title) {
		super(title);
		
		final MainPanel mainPanel = new MainPanel();
		final Toolbar toolbar = new Toolbar(mainPanel);
		
		//mainPanel.changeColor(Color.RED);
		
		setLayout(new BorderLayout());
		
		add(toolbar, BorderLayout.NORTH);
		add(mainPanel, BorderLayout.CENTER);
		
		
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		this.setVisible(true);
	}

}
