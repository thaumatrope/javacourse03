package game.objects;

public enum GameElement {

	ROCK, PAPER, SCISSORS;
	
	private static String[][] compareText = {
			{"Rock matches rock", "Rock gets wrapped", "Rock smashes scissors"},
			{"Paper raps rock", "Paper matches paper", "Paper gets cut"},
			{"Scissors get smashed", "Scissors cut paper", "Scissors match scissors"}			
	};
	
	private int[][] comparison = {

			// @formatter:off
			//         		rock paper scissors
			/*rock*/		{0,		-1,		1},
			/*paper	*/		{1,		0,		-1},
			/*scissors*/	{-1,	1,		0}
			// @formatter:on

	};
	
	public int compare(GameElement other) {
		return comparison[this.ordinal()][other.ordinal()];
	}
	
	public String compareText(GameElement other) {
		return compareText[this.ordinal()][other.ordinal()];
	}
	
}
