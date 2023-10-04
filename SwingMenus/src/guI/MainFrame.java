package guI;

import java.awt.BorderLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
		
		MenuItem openItem = new MenuItem("Open");
		MenuItem saveItem = new MenuItem("Save");
		Menu fileMenu = new Menu("File");
		MenuBar menuBar = new MenuBar();
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		menuBar.add(fileMenu);
		setMenuBar(menuBar);
		
		openItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Open");
			}
		});
		saveItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Save");
			}
		});
		
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
