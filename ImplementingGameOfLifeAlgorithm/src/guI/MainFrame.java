package guI;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class MainFrame extends JFrame{

	private GamePanel gamePanel = new GamePanel();
	
	private static final long serialVersionUID = 1L;
	
	public MainFrame() {
		super("Game of Life");
		
		
		setLayout(new BorderLayout());
		add(gamePanel, BorderLayout.CENTER);
		
		addKeyListener(new KeyAdapter() {
			
			public void keyPressed(KeyEvent e) {
//				System.out.print("Key Pressed: " + e.getKeyChar());
//				System.out.println(" - Key Code: " + e.getKeyCode());
				
				int code = e.getKeyCode();
				switch(code) {
				case 8: // backspace clear
					System.out.println("Backspace pressed.");
					gamePanel.clearGrid();
					break;
				case 32: // space next
					System.out.println("Spacebar pressed.");
					gamePanel.nextGrid();
					break;
				case 10: // enter randomize
					System.out.println("Enter pressed.");
					gamePanel.randomizeGrid();
					break;
				default:
					System.out.println("Some key pressed.");
				}
			}
		});
		
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	

}
