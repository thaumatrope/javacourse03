package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Window window = new Window();
		
		window.setName("First Window");
		window.setHeight(800);
		window.setWidth(600);
		
		System.out.println("Windows - Parameters are:");
		System.out.println("Height > " + window.getHeight());
		System.out.println("Width  > " + window.getWidth());
		System.out.println("Name   > " + window.getName());
	}

}
