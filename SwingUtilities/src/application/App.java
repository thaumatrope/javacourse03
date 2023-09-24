package application;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwingUtilities.invokeLater(()->{
			
			JFrame mainFrame = 	new JFrame(); // represents a window
			
			mainFrame.setSize(600, 400);
			mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			mainFrame.setVisible(true);
			
		});
		
		
		
		
	}

}
