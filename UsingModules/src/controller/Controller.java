package controller;

import cellular.Rule;
import gui.ArtPanel;
import gui.MainFrame;

public class Controller {
	
	private MainFrame mainFrame;
	private ArtPanel artPanel;
	
	public Controller() {
		
		// 22, 30, 90, 110
		artPanel = new ArtPanel(new Rule(90), 50);
		mainFrame = new MainFrame();
		
		mainFrame.setContentPane(artPanel);
		
	}

}
