package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "I ";
		text += "am ";
		text += "a giraffe!";
		
		System.out.println(text);
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("I ");
		sb1.append("am ");
		sb1.append("a ");
		sb1.append("herrng");
		
		String result1 = sb1.toString();
		System.out.println(result1);
		
		StringBuilder sb2 = new StringBuilder("I ");
		sb2.append("am ").append("a ").append("ferret.");
		System.out.println(sb2);
		
		StringBuilder sb3 = new StringBuilder("I ");
		String animal = "elephant";
		sb3.append("am ").append("a ").append(animal);
		System.out.println(sb3);
		

	}

}
