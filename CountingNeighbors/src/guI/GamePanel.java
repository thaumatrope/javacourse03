package guI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JPanel;

import model.World;

public class GamePanel extends JPanel {

	private final static int CELLSIZE = 50;
	private final static Color backgroundColor = Color.BLACK;
	private final static Color foregroundColor = Color.GREEN;
	private final static Color gridColor = Color.GRAY;

	private int topBottomMargin;
	private int leftRightMargin;

	private World world;
	private int rows;
	private int columns;

	private static final long serialVersionUID = 1L;

	public GamePanel() {
//		this.setBackground(Color.BLUE);
		addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				System.out.println("X: " + e.getX() + " - Y: " + e.getY());
				if ((e.getX() >= leftRightMargin) && (e.getX() <= (getWidth() - leftRightMargin))) {
					int col = (e.getX() - leftRightMargin) / CELLSIZE;
					if ((e.getY() >= topBottomMargin) && (e.getY() <= (getHeight() - topBottomMargin))) {
						int row = (e.getY() - topBottomMargin) / CELLSIZE;
						world.setCell(row, col, !world.getCell(row, col));
						System.out.print("row(" + row + "),col(" + col + ") ---");
						System.out.println("Neighbors: " + world.getNeighbors(row, col));
						world.calcNeighbors(row, col);
						repaint();
					}
				}
			}

		});	
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
//		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D) g;

		int width = getWidth();
		int height = getHeight();

		leftRightMargin = ((width % CELLSIZE) + CELLSIZE) / 2;
		topBottomMargin = ((height % CELLSIZE) + CELLSIZE) / 2;

		columns = (width - (leftRightMargin * 2)) / CELLSIZE;
		rows = (height - (topBottomMargin * 2)) / CELLSIZE;

		System.out.println("We have " + rows + " rows and " + columns + " columns.");
		if (world == null) {
			world = new World(rows, columns);
		}else {
			world.resize(rows, columns);
		}


		g2D.setColor(backgroundColor);
		g2D.fillRect(0, 0, width, height);
	
		this.drawGrid(g2D, width, height);

		for (int col = 0; col < columns; col++) {

			for (int row = 0; row < rows; row++) {
				this.fillCell(g2D, row, col, world.getCell(row, col));
			}
		}

	}

	private void fillCell(Graphics2D g2D, int row, int col, boolean status) {

		Color color = status ? foregroundColor : backgroundColor;
		g2D.setColor(color);

		int x = (col * CELLSIZE) + leftRightMargin;
		int y = (row * CELLSIZE) + topBottomMargin;
		g2D.fillRect(x + 1, y + 1, CELLSIZE - 1, CELLSIZE - 1);

	}

	private void drawGrid(Graphics2D g2D, int width, int height) {
		g2D.setColor(gridColor);

		// g2D.drawLine(0, 0, width-1, height-1);

		for (int x = leftRightMargin; x <= (width - leftRightMargin); x += CELLSIZE) {
			g2D.drawLine(x, topBottomMargin, x, height - topBottomMargin);
//			System.out.println("Line x1/y1: " + x + "/" + topBottomMargin);
//			System.out.println("Line x2/y2: " + x + "/" + (height - topBottomMargin));	
		}

		for (int y = topBottomMargin; y <= (height - topBottomMargin); y += CELLSIZE) {
			g2D.drawLine(leftRightMargin, y, width - leftRightMargin, y);
		}

	}
	
	public void randomizeGrid() {
//		System.out.println("Randomize...");
		world.clearModel();
		world.randomizeModel();
		repaint();

	}
	
	public void clearGrid() {
//		System.out.println("Clearing...");
		world.clearModel();
		repaint();

	}
	
	public void nextGrid() {
//		System.out.println("next...");
		world.nextModel();
		repaint();

	}


}

