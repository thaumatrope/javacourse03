package application;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Rota {

	private List<Person> people = new ArrayList<>();
	private List<Set<Person>> days = new ArrayList<>();
	private int peopleListPosition = 0;

	public Rota(List<Person> people) {
		this.people.addAll(people);			
		this.nextWeek();
	}
	
	public Rota() {
		
	}
	
	public void addList(List<Person> people) {
		this.people.addAll(people);
		//this.nextWeek();
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < days.size(); i++) {
			var dayName = Days.values()[i];
			System.out.println("Working on " + dayName);
			var peopleWorking = days.get(i);
			for(var person:peopleWorking) {
				System.out.println(person);
			}
	
		}
		
		return sb.toString();
	}
	
	public void nextWeek() {
		
		days.clear();
		
		for(int day = 0; day < Days.values().length; day++) {
			this.populateDay(day);
		}
	}
	
	private void populateDay(int day) {
				
		VitalSkillSet vitalSkills = new VitalSkillSet();
		Set<Person> workingPeople = new LinkedHashSet<>();
		
		for(int i = 0; i < people.size(); i++){
				
				Person person = people.get(peopleListPosition++);
				
				if(peopleListPosition == people.size()) {
					peopleListPosition = 0;
				}
				
				if(person.isOnHoliday()) {
					continue;
				}
				
				workingPeople.add(person);
				vitalSkills.addAll(person.getSkill());				
				
				if(vitalSkills.isComplete()) {
					break;
				}
			
		}

		days.add(workingPeople);
		
		
	}

	/**
	 * @return the people
	 */
	public List<Person> getPeople() {
		return people;
	}

	/**
	 * @param people the people to set
	 */
	public void setPeople(List<Person> people) {
		this.people = people;
	}
	




}
