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

		grid = new boolean[rows][columns];
	}

	public boolean getCell(int row, int col) {
//		System.out.println("World.getCell() ..../  access grid [" + row + "][" + col + "]");
//		System.out.println("World.getCell() ..../  grid length [" + grid.length + "][" + grid[0].length + "]");
		boolean test = false;
		try {
			test = grid[row][col];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("World.getCell() ..../  access grid [" + row + "][" + col + "]");
			System.out.println("World.getCell() ..../  grid length [" + grid.length + "][" + grid[0].length + "]");
		}
		return grid[row][col];
	}

	public void setCell(int row, int col, boolean status) {
		this.grid[row][col] = status;
	}

	public void randomizeModel() {
		// TODO Auto-generated method stub
		Random random = new Random();

		for (int i = 0; i < ((rows * columns) / 10); i++) {
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
		for (int row = 0; row < rows; row++) {
			Arrays.fill(grid[row], false);
		}
	}

	public void nextModel() {
		
		boolean[][] tempGrid = new boolean[rows][columns];
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < columns; col++) {
//				System.out.print("(" + row + "),(" + col + ") --- ");
//				System.out.println("Neighbors: " + this.getNeighbors(row, col) + " / Active: " + this.calcNeighbors(row, col));
				
				if(this.calcNeighbors(row, col) < 2) { 			//if neighboring cell count < 2, deactivate cell
					tempGrid[row][col] = false;
				}else if(this.calcNeighbors(row, col) > 3) { 	// if neighboring cell count > 3, deactivate cell
					tempGrid[row][col] = false;
				}else if(this.calcNeighbors(row, col) == 3) { 	// if neighboring cell count == 3, activate cell
					tempGrid[row][col] = true;
				}else if(this.calcNeighbors(row, col) == 2){											// if neighboring cell count == 2, nothing
					tempGrid[row][col] = grid[row][col];
				}
				
				
			}
		}
		grid = tempGrid;
	}

	public int getNeighbors(int row, int col) {
		
		int neighbors = 0;
		if ((row == 0) || (row == rows - 1)) {
			if ((col == 0) || (col == columns - 1)) {
				neighbors = 3;
			} else {
				neighbors = 5;
			}
		} else if ((col == 0) || (col == columns - 1)) {
			if ((row == 0) || (row == rows - 1)) {
				neighbors = 3;
			} else {
				neighbors = 5;
			}
		} else {
			neighbors = 8;
		}
		return neighbors;
	}
	
	public int calcNeighbors(int row, int col) {
		
		int neighbors = 0;
		for(int rowOffset = -1; rowOffset <= 1; rowOffset++) {
			for(int colOffset = -1; colOffset <= 1; colOffset++) {
				if((rowOffset == 0)&&(colOffset == 0)){
					continue;
				}
				int gridRow = row + rowOffset;
				int gridCol = col + colOffset;
				
				if((gridRow < 0) || (gridCol < 0)){
					continue;
				}else if((gridRow >= rows)||(gridCol >= columns)){
					continue;
				}
//				System.out.print(gridRow + "," + gridCol + "  ");
				if(getCell(gridRow, gridCol)){
					neighbors++;
				}
			}				
		}
		
//		System.out.println("-- " + neighbors + " active");
		return neighbors;
	}


	public void resize(int rows, int columns) {
		
		if(!((this.rows == rows)&&(this.columns == columns))){
			System.out.println("World.resize() exit..../ actual grid is[" + this.rows + "][" + this.columns + "]");
			boolean [][] gridNew = new boolean[rows][columns]; // new grid		
		    
			int newRows = (this.rows >= rows) ? rows : this.rows;
			int newColumns = (this.columns >= columns) ? columns : this.columns;
	
			for(int row = 0; row < newRows; row++) {
				for(int col = 0; col < newColumns; col++) {
					gridNew[row][col] = grid[row][col];
				}				
			}		

			grid = gridNew;
			gridNew = null;
			this.rows = rows;
			this.columns = columns;
			System.out.println("World.resize() exit..../ new grid is[" + this.rows + "][" + this.columns + "]");
		}
//				for{boolean[]tempGridOuter:grid){
//					System.arraycopy(gridNew[0], 0, tempGridOuter, 0, 5);
//				}
				
		
	}
}
