package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte value1 = (byte)0xFF;
		int value2 = 0xFF;
		
		int result1 = value1 << 4;
		int result2 = value2 << 4;
		
		System.out.println(toBinary(value1));
		System.out.println(toBinary(result1));
		System.out.printf("%08x\n", result1);
		System.out.println();
		System.out.println(toBinary(value2));
		System.out.println(toBinary(result2));
		System.out.printf("%08x\n", result2);
		
		int color = 0x00123456; //HEX RGB
		System.out.println("Color DEC:" + color + "  HEX: " + toHex(color));
		// show only green
		int green = (color&0x0000FF00) >> 8;
		System.out.println("Color Green:" + green + "  HEX: " + toHex(green));
		// show only blue
		int blue = (color&0x000000FF);
		System.out.println("Color Blue  :" + blue + "  HEX: " + toHex(blue));
		// show only blue
		int red = (color&0x00ff0000) >> 16;
		System.out.println("Color Red  :" + red + "  HEX: " + toHex(red));
		
		//recombine
		int colorRecombined = red;
		colorRecombined = colorRecombined << 8;
		colorRecombined = colorRecombined | green;
		colorRecombined = colorRecombined << 8;
		colorRecombined = colorRecombined | blue;
		int colorRecombined2 = (red << 16) | (green << 8) | blue;
		System.out.println("Color Recombined DEC:" + colorRecombined + "  HEX: " + toHex(colorRecombined));
		System.out.println("Color Recombined2 DEC:" + colorRecombined2 + "  HEX: " + toHex(colorRecombined2));

	}
	
	public static String toBinary(int value) {
		return String.format("%8s", Integer.toBinaryString(value)).replace(" ", "0");
	}
	
	public static String toHex(int value) {
		return String.format("%8s", Integer.toHexString(value)).replace(" ", "0");
	}

}
