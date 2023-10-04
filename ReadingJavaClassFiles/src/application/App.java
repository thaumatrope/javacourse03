package application;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {
	
	public static void main(String[] args){	
		
		String filename = "bin\\application\\App.class";
		File file = new File(filename);
		
		if(!file.exists()) {
			System.out.println("File does not exist.");
			System.exit(0);
		}
		App app = new App();
		//app.writeFile(file);
		app.readFile(file);
		
	}
		

	public void writeFile(File file) {		
		
		
		int value1 = 7;
		byte[] bytes = new byte[3];
		bytes[0] = 123;
		bytes[1] = -8;
		bytes[2] = 44;
		System.out.println("value is: " + value1);
		for(byte bit: bytes) {
			System.out.println("bytes is: " + bit);
		}
		
		try(var dos = new DataOutputStream(new FileOutputStream(file))){
			dos.writeInt(value1);
			dos.write(bytes);
			System.out.println("Written: " + file.getAbsolutePath());
			System.out.println("Written in bytes: " + file.length());
		} catch (FileNotFoundException e) {
			System.out.println("Cannot create: " + file.getName());
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Cannot write: " + file.getName());
			//e.printStackTrace();
		}
		
	}
		
	public void readFile(File file)	{
		
		try(var dos = new DataInputStream(new FileInputStream(file))){
//			byte byte1 = dos.readByte();
//			byte byte2 = dos.readByte();
//			byte byte3 = dos.readByte();
//			byte byte4 = dos.readByte();
//
//			StringBuilder result = new StringBuilder();
//			result.append(String.format("%02X", byte1));
//			result.append(String.format("%02X", byte2));
//			result.append(String.format("%02X", byte3));
//			result.append(String.format("%02X", byte4));
			int magicNumber = dos.readInt();
			
			System.out.printf("magicNumber in HEX is: %x\n", magicNumber);	
			
			int minorNumber = dos.readUnsignedShort();
			int majorNumber = dos.readUnsignedShort();
			System.out.printf("majorNumber, minorNumber is: %d, %d\n", majorNumber, minorNumber);	
			System.out.println("Read from: " + file.getAbsolutePath());
		
		} catch (FileNotFoundException e) {
			System.out.println("Cannot read: " + file.getName());
			System.out.println("Read from: " + file.getAbsolutePath());
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Cannot read: " + file.getName());
			System.out.println("Read from: " + file.getAbsolutePath());
			//e.printStackTrace();
		}
		
	}


}
