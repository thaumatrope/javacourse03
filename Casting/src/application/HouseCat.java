package application;

public class HouseCat extends Cat{
	
	@Override  //checks for correct override signature name
	public void vocalize() {  // Method signature
		System.out.println("Meow!!");
	}
	
	public void purr() {
		System.out.println("Purrrrrrrrrr!");
	}

}
