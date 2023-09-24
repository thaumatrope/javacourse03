package game;

import java.util.Random;

import game.objects.GameObject;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissors;

public class Game {

	private GameObject[] objects = { new Rock(), new Paper(), new Scissors() };
	private GetInput getInput = new GetInput();
	private String[] outcomeText = { "Lost!", "Drawn", "Won!" };
	private int wins = 0;
	private int outcome;

	public void run() {
		System.out.println("Game running");

		for (int i = 0; i < 3; i++) {
			Random random = new Random();

			/*for (GameObject obj : objects) {
				System.out.println(obj);
			}*/

			System.out.println();

			GameObject object1 = objects[random.nextInt(objects.length)];
			GameObject object2 = objects[getInput.newInput()];

			System.out.println("You chose:      " + object2);
			System.out.println("Computer chose: " + object1);
			
			outcome = object2.compareTo(object1);
			System.out.println(outcomeText[outcome + 1]);
			wins += outcome;
		} 
		
		if (wins > 0) {
			System.out.println("You have won the match!");
		} else if(wins < 0) {
			System.out.println("You have lost the match!");
		} else {
			System.out.println("The match is a draw!");
		}
		
		getInput.close();

	}

}
