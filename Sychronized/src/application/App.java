package application;

public class App {
	
	private int value = 0;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		new App().run();
		
		
	}
	
	private synchronized void increment() {
		value++;
	}
	
	public void run() throws InterruptedException {
		
		Runnable runnable = () -> {
			for(int i = 0; i < 10000; i++) {
				//System.out.println("Value of i: " + i);
				//value ++;	// no atomic operation	
				increment();
			}
		};
		
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		t1.start();
		t2.start();
		
		System.out.println("Hello1");
		
		t1.join();
		System.out.println("Hello2");
		t2.join();
		System.out.println("Hello3");
		
		System.out.println("Value: " + value);
	}

}
