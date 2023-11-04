package application;

import javax.swing.SwingUtilities;

import controller.Controller;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SwingUtilities.invokeLater(Controller::new);
	}

}
