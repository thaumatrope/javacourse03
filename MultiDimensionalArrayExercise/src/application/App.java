package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] intArray = new int[][]{
				{1,2,3},
				{3,4,5},
				{6,7,8}
		};
		int total = 0;
		
		for(int[] subArray:intArray) {
			for(int num:subArray) {
				System.out.printf("%d  ",num);
			}
			System.out.println();
		}
		System.out.println("---------------");
		for(int i = 0; i < intArray.length;i++){
			System.out.println("Number["+i+"]["+i+"] is: " + intArray[i][i]);
			total += intArray[i][i];
//			for(int j = 0; j < intArray[i].length; j++) {
//				if(i == j) {
//					System.out.println("Number["+i+"]["+j+"] is: " + intArray[i][j]);
//					total += intArray[i][j];
//				}
//				if(i == j) {
//					System.out.println("Number["+i+"]["+j+"] is: " + intArray[i][j]);
//					total += intArray[i][j];
//				}
//				if(i == j) {
//					System.out.println("Number["+i+"]["+j+"] is: " + intArray[i][j]);
//					total += intArray[i][j];
//				}
//			}
		}
		System.out.println("the total number is: " + total);

	}

}
