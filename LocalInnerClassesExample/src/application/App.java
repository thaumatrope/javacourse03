package application;

import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {

	private String name;
	
	public App() {
		name = "Henry";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(this.name); no this-instance yet
		App app = new App();
		app.run();
		
		//new App().run();
		
	}
	
	private void run() {		
		
		//inner class
		class Printer implements Runnable {
			public void print() {
				System.out.println(name + " from within");
			}

			@Override
			public void run() {
				// TODO Auto-generated method stub
				this.print();
			}
		}
		
		//new Printer().print();
		
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		service.scheduleAtFixedRate(new Printer(), 0L, 1L, TimeUnit.SECONDS);
		
		//Timer timer = new Timer();
		//timer.scheduleAtFixedRate(null, 0, 0);
		
		
		
	}

}
