package application;

public class Person {
	private String name;
	private int age;
	private int height;
	
	//Constructor
	public Person() {
		System.out.println("Created a person....");
		
		//intial values
		name = "?";
		age = 0;
		height = 0;
	}
	
	public void setName(String text) {
		this.name = text;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int number) {
		this.age = number;
	}
	
	public int getAge() {
		return this.age;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

}
