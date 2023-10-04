package application;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// big and little endian
		int value1 = 123;
		int valueHEX1 = 0x01020304; // most significant byte 01, least significant byte 04
		
		// investigate its internal ordering
		ByteBuffer buffer1 = ByteBuffer.allocate(4);
		buffer1.putInt(valueHEX1);
		
		byte[] bytes = buffer1.array();
		
		for(var b:bytes) {
			System.out.printf("Byte is: %02X\n", b);
		}
		
		// BIG ENDIAN - MSB at lowest memory address
		// LITTLE ENDIAN - MSB at highest memory address
		
		ByteBuffer buffer2 = ByteBuffer.allocate(4);
		buffer2.order(ByteOrder.LITTLE_ENDIAN);
		buffer2.putInt(valueHEX1);
		bytes = buffer2.array();
		for(var b:bytes) {
			System.out.printf("Byte is: %02X\n", b);
		}
		
	}

}
