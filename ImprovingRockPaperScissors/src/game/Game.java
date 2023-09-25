package game;

import java.util.Random;

import game.objects.GameElement;

public class Game {

	private GetInput getInput = new GetInput();

	private int wins = 0;

	public void run() {
		System.out.println("Game running");

		for (int i = 0; i < 3; i++) {
			Random random = new Random();

			System.out.println();

			GameElement playerComputer = GameElement.values()[random.nextInt(GameElement.values().length)];
			GameElement playerHuman = GameElement.values()[getInput.newInput()];

			System.out.println( playerHuman + "(Player) --- " + playerComputer + "(Computer)");

			if (playerHuman.beats(playerComputer)) {
				wins++;
				System.out.println("Won! -- " + playerHuman + " beats " + playerComputer);
			} else if (playerHuman == playerComputer) {
				System.out.println("Draw! -- " + playerHuman + " matches " + playerComputer);
			} else {
				wins--;
				System.out.println("Lost! -- " + playerComputer + " beats " + playerHuman);
			}

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
