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
//		this.setBackground(Color.BLUE);
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
		
		this.fillCell(g2D, 2, 4, true);
		this.fillCell(g2D, 0, 0, true);
		this.drawGrid(g2D, width, height);
		
	}
	
	private void fillCell(Graphics2D g2D, int row, int col, boolean status) {

		Color color = status ? foregroundColor : backgroundColor;
		g2D.setColor(color);
		
		int x = (col * CELLSIZE) + leftRightMargin;
		int y = (row * CELLSIZE) + topBottomMargin;
		g2D.fillRect(x, y, CELLSIZE, CELLSIZE);
//		System.out.println("Painting at x: " + (x+1) + " / y: " + (y+1) + " / to x: " + (x+1+CELLSIZE-2) + " / to y: " + (y+1+CELLSIZE-2));
//		System.out.println("Line X at: " + x + " / Line y at: " + y);
	}
	
	private void drawGrid(Graphics2D g2D, int width, int height) {
		g2D.setColor(gridColor);
		
		//g2D.drawLine(0, 0, width-1, height-1);
		
		for(int x = leftRightMargin; x <= (width - leftRightMargin); x += CELLSIZE){
			g2D.drawLine(x, topBottomMargin, x, height - topBottomMargin);
//			System.out.println("Line x/y: " + x + "/" + topBottomMargin + " --- to Line x/y: " + x + "/" + (height - topBottomMargin));
			
			}
		
		for(int y = topBottomMargin; y <= (height - topBottomMargin); y += CELLSIZE){
			g2D.drawLine(leftRightMargin, y, width - leftRightMargin, y);
		}
		
	}


}
