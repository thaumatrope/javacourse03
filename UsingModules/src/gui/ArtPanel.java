package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.swing.JPanel;

import cellular.Rule;

@SuppressWarnings("serial")
public class ArtPanel extends JPanel {
	
	private BufferedImage image;
	private Rule rule;
	private Random random = new Random();
	private final int ON_COLOR = 0x00FF00;
	private final int OFF_COLOR = 0x006400;
	private int random_number;

	public ArtPanel() {
		setBackground(Color.green);
		
	}
	
	public ArtPanel(Rule rule, int weight) {
		this.rule = rule;
		this.random_number = weight;
	}

	@Override
	protected void paintComponent(Graphics g) {

		int width = getWidth();
		int height = getHeight();
		
		if(image == null || image.getWidth() != width || image.getHeight() != height) {
			image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);			
		}
		
		boolean on = true;
		for(int x = 0; x < width; x++) {
			
			image.setRGB(x, 0, on ? ON_COLOR:OFF_COLOR);
			//System.out.println("Got RGB at x: " + x + " / y: 0 getRGB is: " + image.getRGB(x, 0));
			if(random.nextInt(random_number) == 0) {
				on = !on;
			}
		}
		
		for(int y = 1; y < height; y++) {
			for(int x = 0; x < width; x++){
//				int wolfram = 0;
//				for(int shift = -1; shift < 2; shift++) {
//					int a = shift;;
//					if((x == 0) && (shift < 0)) a = width -1;
//					if((x == (width-1)) && (shift > 0)) a = -x;
//					a = image.getRGB(x+a, y-1);
//					//System.out.println("Got RGB at x: " + (x+shift) + " / y: " + (y-1) + " RGB is: " + a);
//					if((a & ON_COLOR) == ON_COLOR) {
//						wolfram = wolfram << 1; 
//						wolfram++;
//					}else {
//						wolfram = wolfram << 1; 
//					}
//				}
				
				int xLeft = x == 0 ? width - 1: x - 1;
				int xRight = x == width - 1 ? 0: x + 1;
				
				int leftColor = image.getRGB(xLeft, y-1) & 0xFFFFFF;
				int centerColor = image.getRGB(x, y-1) & 0xFFFFFF;
				int rightColor = image.getRGB(xRight, y-1) & 0xFFFFFF;
				
				int wolfram = 0;
				if(leftColor == ON_COLOR) {
					wolfram++;
				}
				wolfram = wolfram << 1;
				if(centerColor == ON_COLOR) {
					wolfram++;
				}
				wolfram = wolfram << 1;
				if(rightColor == ON_COLOR) {
					wolfram++;
				}
				
				image.setRGB(x, y, rule.get(wolfram) == 1 ? ON_COLOR:OFF_COLOR);
				
			}		
		}
		
		
		g.drawImage(image, 0, 0, null);
	}
	
}
