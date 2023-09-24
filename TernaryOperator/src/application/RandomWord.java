package application;

import java.util.Random;

public class RandomWord {

	String[] words = { "abruptly", "absurd", "abyss", "affix", "askew", "avenue", "awkward", "axiom", "azure",
			"bagpipes", "bandwagon", "banjo", "bayou", "beekeeper", "bikini", "blitz", "blizzard", "boggle", "bookworm",
			"boxcar", "boxful", "buckaroo", "buffalo", "buffoon", "buxom", "buzzard", "buzzing", "buzzwords", "caliph",
			"cobweb", "cockiness", "croquet", "crypt", "curacao", "cycle", "daiquiri", "dirndl", "disavow", "dizzying",
			"duplex", "dwarves", "embezzle", "equip", "espionage", "euouae", "exodus", "faking", "fishhook", "fixable",
			"fjord", "flapjack", "flopping", "fluffiness", "flyby", "foxglove", "frazzled", "frizzled", "fuchsia",
			"funny", "gabby", "galaxy", "galvanize", "gazebo", "giaour", "gizmo", "glowworm", "glyph", "gnarly",
			"gnostic", "gossip", "grogginess", "haiku", "haphazard", "hyphen", "iatrogenic", "icebox", "injury", "ivy",
			"jackpot", "jaundice", "jawbreaker", "jaywalk", "jazziest", "jazzy", "jelly", "jigsaw", "jinx", "jiujitsu",
			"jockey", "jogging", "joking", "jovial", "joyful", "juicy", "jukebox", "jumbo", "kayak", "kazoo", "keyhole",
			"khaki", "kilobyte", "kiosk", "kitsch", "kiwifruit", "klutz", "knapsack", "larynx", "lengths", "lucky",
			"luxury", "lymph", "marquis", "matrix", "megahertz", "microwave", "mystify", "naphtha", "nightclub",
			"nowadays", "numbskull", "nymph", "onyx", "ovary", "oxidize", "oxygen", "pajama", "peekaboo", "phlegm",
			"pixel", "pizazz", "pneumonia", "polka", "pshaw", "psyche", "puppy", "puzzling", "quartz", "queue", "quips",
			"quixotic", "quiz", "quizzes", "quorum", "razzmatazz", "rhubarb", "rhythm", "rickshaw", "schnapps",
			"scratch", "shiv", "snazzy", "sphinx", "spritz", "squawk", "staff", "strength", "strengths", "stretch",
			"stronghold", "stymied", "subway", "swivel", "syndrome", "thriftless", "thumbscrew", "topaz", "transcript",
			"transgress", "transplant", "triphthong", "twelfth", "twelfths", "unknown", "unworthy", "unzip", "uptown",
			"vaporize", "vixen", "vodka", "voodoo", "vortex", "voyeurism", "walkway", "waltz", "wave", "wavy", "waxy",
			"wellspring", "wheezy", "whiskey", "whizzing", "whomever", "wimpy", "witchcraft", "wizard", "woozy",
			"wristwatch", "wyvern", "xylophone", "yachtsman", "yippee", "yoked", "youthful", "yummy", "zephyr",
			"zigzag", "zigzagging", "zilch", "zipper", "zodiac", "zombie" };

	private String chosenWord;
	private Random random = new Random();
	private char[] characters; // initialized with \u0000

	public RandomWord() {

		System.out.println("Randomizing the Word ....");

		chosenWord = words[random.nextInt(words.length)];
		characters = new char[chosenWord.length()];

	}

	public String toString() {
			
		StringBuilder sb = new StringBuilder();
		
		for (char c : characters) {
			if (c == '\u0000') {
				sb.append('_');
			} else {
				sb.append(c);
			}
			sb.append(' ');
		}

//		for (int i = 0; i < characters.length; i++) {
//			if(chosenWord.charAt(i) == guessedChar) {
//				characters[i] = guessedChar;
//				
//			}
//			text += characters[i];
//		}

		return sb.toString();
	}

}
