package application;

import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File currentDirectory = new File(".");  // current directory
		
		System.out.println(currentDirectory.getAbsolutePath());
		try {
			System.out.println(currentDirectory.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(String file:currentDirectory.list()){
			System.out.println(file);
		}
	}

}
