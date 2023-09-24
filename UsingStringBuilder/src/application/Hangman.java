package application;

public class Hangman {
	private boolean running = false;
	private RandomWord word = new RandomWord();

	void run() {

		do {
			displayWord();
			getUserInput();
			checkUserInput();

		} while (running);

	}

	private void getUserInput() {
		System.out.println("getUserIUnput");
	}

	private void checkUserInput() {
		System.out.println("checkUserInput");
	}

	void displayWord() {
		System.out.println(word);
	}

}
