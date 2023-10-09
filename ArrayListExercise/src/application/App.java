package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class MyList {

	double sum;
	ArrayList<Integer> list = new ArrayList<>();

	public double getAverage() {

		sum = 0;
		list.forEach(e -> {
			System.out.print(" added " + e);
			sum += e;
		});
		System.out.println();
		return sum / list.size();

	}

	/**
	 * @return the list
	 */
	public ArrayList<Integer> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(ArrayList<Integer> list) {
		this.list = list;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		Collections.sort((List<Integer>) list);
		list.forEach(e -> {
			sb.append(e + "/");
		});

		return sb.toString();

	}

}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String line;
		int number;
		final String end = "stop";
		boolean loop = true;
		MyList mylist = new MyList();
		Scanner scanner = new Scanner(System.in);

		while (loop) {
			try {
				System.out.print("Please enter a number:");
				line = scanner.nextLine();
				if (line.equals(end)) {
					System.out.println("You have quitted by typing 'quit'.");
					System.out.println("Your average was: " + mylist.getAverage());
					System.out.println(mylist);
					loop = false;
				} else {
					number = Integer.parseInt(line);
					mylist.getList().add(number);
				}

			} catch (InputMismatchException e) {
				System.out.println("There was no input");

			} catch (NumberFormatException e) {

				System.out.println("This was not a number!");
			}

		}
		
		scanner.close();
	}

}
