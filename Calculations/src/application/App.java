package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double personHeight = 1.67;
		double flagpoleHeight = 2.0;

		// calculate the height of seven people plus flagpole
		double totalHeight = (personHeight * 7) + flagpoleHeight; // operator precedent rules

		System.out.println(totalHeight);

	}

}
