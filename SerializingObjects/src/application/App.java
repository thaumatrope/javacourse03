package application;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	private String name;
	private int id;
	
	public Person(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}
	
	
}

public class App {

	public static void main (String[] args) {
		
		Person p1 = new Person("Annie", 007);
		
		String pathString = "test.bin";
		try (var os = new ObjectOutputStream(new FileOutputStream(pathString))){
			os.writeObject(pathString);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Cannot create file: " + pathString);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Cannot write file: " + pathString);
		}
		
		System.out.println("Completed - " + pathString + " was created.");
		
	}
	
	
}
