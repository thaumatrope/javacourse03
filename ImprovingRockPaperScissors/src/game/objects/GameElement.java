package game.objects;

public enum GameElement {

	ROCK, PAPER, SCISSORS;
	
	private GameElement beats;
	
	static {
		ROCK.beats = SCISSORS;
		PAPER.beats = ROCK;
		SCISSORS.beats = PAPER;
	}
	
	public boolean beats(GameElement other) {
//		if(this.beats == other) {
//			return true;
//		} else {
//			return false;
//		}
		return this.beats == other;
	}
	
	
}
