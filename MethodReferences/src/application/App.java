package application;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class App {
	
//	static class Run implements Runnable{
//
//		@Override
//		public void run() {
//			// TODO Auto-generated method stub
//			System.out.println("Hello");
//		}
//		
//	}
//	
	public static void greet() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var service = Executors.newScheduledThreadPool(1);
		service.scheduleAtFixedRate(App::greet, 0, 500, TimeUnit.MILLISECONDS);
	}

}
