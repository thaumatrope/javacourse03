package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class MyList {

	double sum;
	ArrayList<Double> list = new ArrayList<>();

	public double getAverage() {
		
		if(list.size() == 0) {
			return 0;
		}
		sum = 0;
		list.forEach(e -> {
			System.out.print(e + "/");
			sum += e;
		});
		System.out.println();
		return sum / list.size();

	}

	/**
	 * @return the list
	 */
	public ArrayList<Double> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(ArrayList<Double> list) {
		this.list = list;
	}

	@Override
	public String toString() {

		if(list.size() == 0) {
			return "You have not entered a number.";
		}
		StringBuilder sb = new StringBuilder();
		Collections.sort((List<Double>) list);
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
		double number;
		final String end = "stop";
		boolean loop = true;
		MyList mylist = new MyList();
		Scanner scanner = new Scanner(System.in);

		while (loop) {
			try {
				System.out.print("Please enter a number (or 'stop' to quit):");
				line = scanner.nextLine().trim();
				if (line.equalsIgnoreCase(end)) {
					System.out.println("You have quitted by typing 'stop'.");
					System.out.println("Your average was: " + mylist.getAverage());
					System.out.println(mylist);
					loop = false;
				} else {
					number = Double.parseDouble(line);
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
