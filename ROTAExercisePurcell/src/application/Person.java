package application;

import java.util.HashSet;
import java.util.Set;

public class Person {

	private String name;
	private boolean onHoliday = false;
	private Set<Skill> skills;

	public Person(String name) {
		this.setName(name);
		skills = new HashSet<>();		
		
	}
	
	public void addSkill(Skill skill) {
		skills.add(skill);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: " + name);
		sb.append("\t");
		sb.append("Skills: ");
		for (var skill : skills) {
			sb.append(skill + " / ");
		}
		if (skills.size() > 0) {
			sb.replace(sb.length() - 2, sb.length() + 1, "");

		}

		return sb.toString();

	}

	
	public Set<Skill> getSkill() {

		return skills;
	}

	/**
	 * @return the onHoliday
	 */
	public boolean isOnHoliday() {
		return onHoliday;
	}

	/**
	 * @param onHoliday the onHoliday to set
	 */
	public void setOnHoliday(boolean onHoliday) {
		this.onHoliday = onHoliday;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	
}
