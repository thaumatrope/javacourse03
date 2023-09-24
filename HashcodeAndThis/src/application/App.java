package application;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fox fox1 = new Fox();
		Fox fox2 = new Fox();
		Fox foxx = fox1;
		
		System.out.println(fox1);
		System.out.println(fox1.hashCode());
		System.out.printf("%x\n",fox1.hashCode());
		System.out.println();
		System.out.println(fox2);
		System.out.println(fox2.hashCode());
		System.out.printf("%x\n",fox2.hashCode());
		System.out.println();
		System.out.println(foxx);
		System.out.println(foxx.hashCode());
		System.out.printf("%x\n",foxx.hashCode());
		
		System.out.println(fox1.name);
		
		
		
	
	}

}
