package application;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GamePanel extends JPanel{


	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D g2D = (Graphics2D)g;
		
		int width = getWidth();
		int height = getHeight();
		
		g2D.setColor(Color.GREEN);
		g2D.fillRect(0, 0, width, height);
		
		
	}

	private static final long serialVersionUID = 1L;
	
	public GamePanel() {
		//this.setBackground(Color.BLUE);
	}

}
