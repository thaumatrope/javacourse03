package application;

import java.util.Timer;
import java.util.TimerTask;

class Task extends TimerTask{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello!");
		
	}
	
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task(), 0L, 1000l); //long values  explicit l or L
		
		
	}
	
	
}
