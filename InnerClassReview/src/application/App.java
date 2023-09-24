package application;

public class App implements Runnable{
	
	private String name = "Mickey Mouse";
	
	public static class InnerStaticClass implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Hello from InnerStaticClass");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		new App().start();
	}
	
	public void start() {
		
		class LocalInnerClass implements Runnable{

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(name + " from LocalInnerClass");
			}
			
		}
		//App class
		activate(this);
		
		//InnerStaticClass
		activate(new InnerStaticClass());
		
		//LocalInnerClass
		activate(new LocalInnerClass());
		
		//InnerClass
		activate(new InnerClass());
		
		//Anonymous
		activate(new Runnable() {
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(name + " from AnonymousClass");
			}
		});
			
	}
	
	public void activate(Runnable runner) {
		runner.run();
	}
	
	public class InnerClass implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println(name + " from InnerClass");
		}
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name + " from AppClass");
	}

}
