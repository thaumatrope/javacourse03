package application;

import javax.swing.SwingUtilities;

import guI.MainFrame;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SwingUtilities.invokeLater(() -> new MainFrame());
	}

}
