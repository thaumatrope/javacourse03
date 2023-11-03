package test;

import controller.Rule;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rule rule = new Rule(91);
		
		System.out.println(rule);
		
		for(int i = 7; i >= 0; i--) {
			System.out.print(rule.get(i));
			
		}
		System.out.println();
	}

}
