package application;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("I am running!");
		
	}
	
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		
		executor.scheduleAtFixedRate(new Task(), 0, 1L, TimeUnit.SECONDS);
	}
	
	
}
