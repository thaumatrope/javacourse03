package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int id1;
	private transient int id2;
	private Integer id3;
	private transient Integer id4;
	
	public Person(String name, int id) {
		this.name = name;
		this.id1 = id;
		this.id2 = 100;
		this.id3 = 200;
		this.id4 = 300;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id1=" + id1 + ", id2=" + id2 + ", id3=" + id3 + ", id4=" + id4 + "]";
	}
	
	
}

public class App {

	public static void main (String[] args) {
		
		Person p1 = new Person("Annie", 007);
		
		String pathString = "test.bin";
		
		try (var os = new ObjectOutputStream(new FileOutputStream(pathString))){
			os.writeObject(p1);
			System.out.println(p1);
			
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
		
		try (var os = new ObjectInputStream(new FileInputStream(pathString))){
			Person p2 = (Person) os.readObject();
			
			System.out.println(p2);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Cannot open file: " + pathString);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Cannot read file: " + pathString);
		} catch (ClassNotFoundException e) {
			System.out.println("Cannot read object from file: " + pathString);
		}
	}
	
	
}
