package application;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Rota extends ArrayList<Person> {

	private int positionAddWorker;
	private int PersonWorkingTomorrow;
	private int PersonWorkingToday;
	

	private final int PERSONMAX = 9;

	public String toString() {
		// display entire next week rota

		return null;

	}

	public void today() {
		
		this.printShift(LocalDate.now(), true);	    
	}
	
	public void nextWeek() {
		// rota moves one week forward	    

	    this.printShift(LocalDate.now(), false);
	}
	
	public void daysAhead(int days) {
		
		this.printShift(LocalDate.now().plusDays(days), true);
	}
	
	private void printShift(LocalDate date, boolean daily) {
		
		if(daily) {
			date = date.plusDays(1);
//			System.out.println("New end date is: " + date);
		}else {
			date = date.with(DayOfWeek.SUNDAY);
			System.out.println("Weekly Shift at " + date.plusDays(1));
			date = date.plusDays(8);
//			System.out.println("New end date is: " + date);
		}
		
		LocalDate tmpDate = LocalDate.now();
		int workers = PersonWorkingToday;
		int workersFound = 0;
		boolean print = false;
		List<Person> thisShift = new ArrayList<>();
		
		while(!tmpDate.equals(date)) {
			if(daily) {
				if(tmpDate.equals(date.minusDays(1))) {
					print = true;					
				}
			}else {
				if(tmpDate.equals(date.minusDays(7))){
					print = true;
				}
			}
			if(print) System.out.println("Shift at " + tmpDate);
					
			for (int i = 0; i < this.size(); i++) {
				if (!this.get(workers % 9).isOnHoliday()) {
					if ((workers % 9) < this.size()) {
						thisShift.add(this.get(workers % 9));
						if(print) System.out.println(this.get(workers % 9));
						workers = ++workers % 9;
						if (++workersFound >= 3) {
							if(this.checkSkillsComplete(thisShift)) {
								if(print) System.out.println("Workers for this Shift are complete.");
								
								break;
							}
						}
					}
				}
			}
			tmpDate = tmpDate.plusDays(1);
			workersFound = 0;
			thisShift = new ArrayList<Person>();
			
		}
		
	}	
	
	public boolean checkSkillsComplete(List<Person> nextShift) {
		
		boolean hasManager = false;
		boolean hasProgrammer = false;
		boolean hasReceptionist = false;
		
		for(var person: nextShift) {
			if(person.hasSkill("PROGRAMMER")) hasProgrammer = true;
			if(person.hasSkill("MANAGER")) hasManager = true;
			if(person.hasSkill("RECEPTIONIST")) hasReceptionist = true;
		}		
		
		return hasManager && hasProgrammer && hasReceptionist;
		
	}



	public void add(String person, String... skills) {
		if (positionAddWorker < PERSONMAX) {
			if (this.size() <= positionAddWorker) {
				this.add(positionAddWorker, new Person(person, skills));
//				System.out.println("Person: " + person + " / added at: " + position);
			} else {
				this.set(positionAddWorker, new Person(person, skills));
//				System.out.println("Person: " + person + " / set at: " + position);
			}
			

		} else {
			positionAddWorker = 0;
			this.set(0, new Person(person, skills));
//			System.out.println("Person: " + person + " / set at: " + position);
		}
		positionAddWorker++;

	}

	public void printAllPersons() {
		for (var person : this) {
			System.out.println(person);
		}
	}

}
