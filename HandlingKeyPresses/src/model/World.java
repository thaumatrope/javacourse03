package model;

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
