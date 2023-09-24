package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int MAX = 12;
		int[][] int_array = new int[12][12];
		
		for(int i = 0; i < MAX; i++) {
			for(int j = 0; j < MAX; j++) {
				int_array[i][j] = (j+1) * (i+1);
			}
			
		}
		
		for(int[] subArray:int_array) {
			for(int num:subArray) {
				System.out.printf("%4d",num);
			}
			System.out.println();
		}

	}

}
