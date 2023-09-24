package application;

public class Hangman {
	private boolean running = true;
	private RandomWord word = new RandomWord();
	private GetChar getChar = new GetChar();
	private int guessCount;
	private int falseCount;
	private char guessChar;
	private boolean runUserInput;

	void run() {

		do {
			displayWord();
			getUserInput();
			checkUserInput();

		} while (running);

	}

	void displayWord() {
		System.out.println(word);
		System.out.println((10 - falseCount) + " attemps remaining.");
	}

	private void getUserInput() {
		// Ask user to enter a character
		// Get the character as String
		// Pass the character to RanomWord as the argument to a method
		// System.out.println("getUserIUnput");
		runUserInput = true;
		do {
			guessChar = getChar.newChar();
			if (word.checkUserInput(guessChar)) {
				runUserInput = false;
			} else {
				System.out.println("The character was already used.");
			}

		} while (runUserInput);		

	}

	private void checkUserInput() {
		// System.out.println("checkUserInput");
		
		guessCount += 1;
		
		if (!word.addGuess(guessChar)) {
			falseCount += 1;
		}		
		
		if (falseCount >= 10) {
			System.out.println("You have too much bad guesses. Game Over!.");
			running = false;
		}else {		
			if (word.isComplete()) {
				System.out.println("You have guessed the word in " + guessCount + " attempts!!");
				System.out.println("The word is " + word);
				running = false;
				guessCount = 0;		
				
			}
		}
	}

	public void close() {
		getChar.close();
	}

}
