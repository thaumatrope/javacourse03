package application;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GamePanel extends JPanel{

	private final static int CELLSIZE = 50;
	private final static Color backgroundColor = Color.BLACK;
	private final static Color foregroundColor = Color.GREEN;
	private final static Color gridColor = Color.GRAY;
	
	private int topBottomMargin;
	private int leftRightMargin;
	
	private static final long serialVersionUID = 1L;
	
	public GamePanel() {
		//this.setBackground(Color.BLUE);
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D g2D = (Graphics2D)g;
		
		int width = getWidth();
		int height = getHeight();
		
		leftRightMargin = ((width % CELLSIZE) + CELLSIZE)/2;
		topBottomMargin = ((height % CELLSIZE) + CELLSIZE)/2;
		
		g2D.setColor(backgroundColor);
		g2D.fillRect(0, 0, width, height);
		
//		g2D.setColor(foregroundColor);
//		g2D.fillRect(leftRightMargin, topBottomMargin, width - (2*leftRightMargin), height - (2*topBottomMargin));
//		
		this.drawGrid(g2D, width, height);
		
	}
	
	private void drawGrid(Graphics2D g2D, int width, int height) {
		g2D.setColor(gridColor);
		
		//g2D.drawLine(0, 0, width-1, height-1);
		
		for(int x = leftRightMargin; x <= (width - leftRightMargin); x += CELLSIZE){
			g2D.drawLine(x, topBottomMargin, x, height - topBottomMargin);
		}
		for(int y = topBottomMargin; y <= (height - topBottomMargin); y += CELLSIZE){
			g2D.drawLine(leftRightMargin, y, width - leftRightMargin, y);
		}
		
	}


}
