package application;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

class Alert extends TimerTask {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// System.out.println("Hello!");
		JOptionPane.showMessageDialog(null, "Egg cooked!");
		System.exit(0);

	}

}

class Status implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Timer running!");

	}

}

public class App {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Start Egg cooking!");

		// Abstract Class
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Alert(), 20000l, 20000l); // long values explicit l or L

		
		// Interface
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Status(), 0, 5L, TimeUnit.SECONDS);

	}

}
