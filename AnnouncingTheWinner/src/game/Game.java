package game;

import java.util.Random;

import game.objects.GameElement;


public class Game {

	private GetInput getInput = new GetInput();
	private String[] outcomeText = { "Lost!", "Drawn", "Won!" };

	private int wins = 0;
	private int outcome;

	

	public void run() {
		System.out.println("Game running");

		for (int i = 0; i < 3; i++) {
			Random random = new Random();

			System.out.println();

			GameElement playerComputer = GameElement.values()[random.nextInt(GameElement.values().length)];
			GameElement playerHuman = GameElement.values()[getInput.newInput()];

			System.out.println("You chose:      " + playerHuman + "(" + playerHuman.ordinal() + ")");
			System.out.println("Computer chose: " + playerComputer + "(" + playerComputer.ordinal() + ")");
			
			outcome = playerHuman.compare(playerComputer);
			
			System.out.print(outcomeText[outcome + 1] + " - ");
			System.out.println(playerHuman.compareText(playerComputer));
			wins += outcome;

		}
		
		if (wins > 0) {
			System.out.println("\nYou have won the match!");
		} else if (wins < 0) {
			System.out.println("\nYou have lost the match!");
		} else {
			System.out.println("\nThe match is a draw!");
		}

		getInput.close();

	}

}
