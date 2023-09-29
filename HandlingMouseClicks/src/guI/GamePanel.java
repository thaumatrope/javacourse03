package guI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JPanel;

import model.World;

public class GamePanel extends JPanel{

	private final static int CELLSIZE = 50;
	private final static Color backgroundColor = Color.BLACK;
	private final static Color foregroundColor = Color.GREEN;
	private final static Color gridColor = Color.GRAY;
	
	private int topBottomMargin;
	private int leftRightMargin;
	
	private World world;
	
	private static final long serialVersionUID = 1L;
	
	public GamePanel() {
//		this.setBackground(Color.BLUE);
		addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
	
				System.out.println(e.getX() + " - " + e.getY());
				
				world.setCell(13, 13, true);
				repaint();
			}
			
			
		});	
			

	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
//		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D)g;
		
		int width = getWidth();
		int height = getHeight();
		
		leftRightMargin = ((width % CELLSIZE) + CELLSIZE)/2;
		topBottomMargin = ((height % CELLSIZE) + CELLSIZE)/2;
		
		int rows = (width - (leftRightMargin *2)) / CELLSIZE;
		int columns =(height - (topBottomMargin * 2))/ CELLSIZE;
		System.out.println("We have " + rows + " rows and " + columns + " columns.");
		if(world == null) {
			world = new World(rows, columns);
		}
		
//		for(int rand = 0; rand < 10; rand++ ) {
//			world.setCells(new Random().nextInt(14), new Random().nextInt(14), true);	
//		}
		world.setCell(0, 0, true);	
		world.setCell(3, 2, true);	
		
		
		g2D.setColor(backgroundColor);
		g2D.fillRect(0, 0, width, height);
		
//		g2D.setColor(foregroundColor);
//		g2D.fillRect(leftRightMargin, topBottomMargin, width - (2*leftRightMargin), height - (2*topBottomMargin));
//		
		this.drawGrid(g2D, width, height);
//		this.fillCell(g2D, 2, 4, true);
//		this.fillCell(g2D, 0, 0, true);
		
		for(int col = 0; col < rows; col++) {
			
			for(int row = 0; row < columns; row++) {
				this.fillCell(g2D, row, col, world.getCell(row,col));
			}
		}
		
		
	}
	
	private void fillCell(Graphics2D g2D, int row, int col, boolean status) {

		Color color = status ? foregroundColor : backgroundColor;
		g2D.setColor(color);
		
		int x = (col * CELLSIZE) + leftRightMargin;
		int y = (row * CELLSIZE) + topBottomMargin;
		g2D.fillRect(x+1, y+1, CELLSIZE-1, CELLSIZE-1);
//		System.out.println("Painting at x: " + (x+1) + " / y: " + (y+1) + " / to x: " + (x+1+CELLSIZE-2) + " / to y: " + (y+1+CELLSIZE-2));
//		System.out.println("Line X at: " + x + " / Line y at: " + y);
	}
	
	private void drawGrid(Graphics2D g2D, int width, int height) {
		g2D.setColor(gridColor);
		
		//g2D.drawLine(0, 0, width-1, height-1);
		
		for(int x = leftRightMargin; x <= (width - leftRightMargin); x += CELLSIZE){
			g2D.drawLine(x, topBottomMargin, x, height - topBottomMargin);
//			System.out.println("Line x1/y1: " + x + "/" + topBottomMargin);
//			System.out.println("Line x2/y2: " + x + "/" + (height - topBottomMargin));	
			}
		
		for(int y = topBottomMargin; y <= (height - topBottomMargin); y += CELLSIZE){
			g2D.drawLine(leftRightMargin, y, width - leftRightMargin, y);
		}
		
	}


}


