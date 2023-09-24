package game;

import java.util.Random;

import game.objects.GameObject;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissors;

public class Game {
	
	private GameObject[] objects = {new Rock(), new Paper(), new Scissors()}; 
	
	public void run() {
		System.out.println("Game running");
		
		Random random = new Random();
		
		for(GameObject obj:objects) {
			System.out.println(obj);
		}
		
		System.out.println();
		
		GameObject object1 = objects[random.nextInt(objects.length)];
		GameObject object2 = objects[random.nextInt(objects.length)];
		
		System.out.println(object1);
		System.out.println(object2);
		
		System.out.println(object1.compareTo(object2));
	}

}
