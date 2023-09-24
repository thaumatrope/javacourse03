package application;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Alert extends TimerTask{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello!");
		
	}
	
}


class Status implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("I am running!");
		
	}
	
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Interface
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);		
		executor.scheduleAtFixedRate(new Status(), 0, 1L, TimeUnit.SECONDS);
		
		//Abstract Class
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Alert(), 10L, 1000l); //long values  explicit l or L
	}
	
	
}
