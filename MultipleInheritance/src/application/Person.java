package application;

public class Person implements Speaker, Greeter{

	@Override
	public void greet() {
		// TODO Auto-generated method stub
		System.out.println("Hello!");
		
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("I am a person!");
		
	}

}
