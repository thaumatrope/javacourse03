package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String[][] texts = new String[] {"One","Two"};
		
		String[][] texts = {
				{"one","two","three"},
				{"four","five"},
				{"seven", "eight", "nine"},
				
		};
		
		System.out.println(texts);
		
		for(int i = 0; i < texts.length; i++) {
			//System.out.println(texts[i]);
			
			//String[] subArray = texts[i];
			for(int j = 0; j < texts[i].length; j++) {
				System.out.printf("%s\t",texts[i][j]);					
			}
			System.out.println();
		}

	}

}
