package model;

import java.util.Arrays;
import java.util.Random;

public class World {
	
	private int rows;
	private int columns;
	
	private boolean[][] grid;
	
	public World(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		
		grid = new boolean[1024][1024];
	}

	public boolean getCell(int row, int col) {
		return grid[row][col];
	}
	
	public void setCell(int row, int col, boolean status){
		this.grid[row][col] = status;
	}

	public void randomizeModel() {
		// TODO Auto-generated method stub
		Random random = new Random();

		for(int i = 0; i < ((rows*columns)/10); i++) {
			grid[random.nextInt(rows)][random.nextInt(columns)] = random.nextBoolean();
		}
	}
	
	public void clearModel() {
		
//		for(int i = 0; i < rows; i++) {
//			for(int j = 0; j < columns; j++) {
//				this.setCell(i, j, false);
//			}
//		}	
		// clear by Array.fill()
		for(int row = 0; row < rows; row++) {
			Arrays.fill(grid[row], false);
		}
	}
	
//	public void resize(int rows, int columns) {
//		
//		int x = 0;
//		int y = 0;
//		boolean[][] tempGrid = new boolean[rows][columns].;
//		for(boolean[]tempGrid1:grid) {
//			y = 0;
//			for(boolean tempGrid2:tempGrid1) {
//				tempGrid[x][y] = tempGrid2;
//				y++;
//			}
//			x++;
//		}
//	}
}
