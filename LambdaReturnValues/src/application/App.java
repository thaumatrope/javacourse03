package application;

interface Joiner{
	String join(String text1, String text2);
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Joiner join1 = (s1, s2) -> {
			String joined = s1 + s2;
			return joined;
		};
		
		App.run(join1);
		
		// simplify
		Joiner join2 = (s1, s2) -> s1 + s2;
		
		App.run(join2);
	}
	
	public static void run(Joiner joiner) {
		System.out.println(joiner.join("Hello", " John!"));
	}

}
