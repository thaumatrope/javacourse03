package application;

import java.util.HashSet;

public class Person {

	private enum Skill {
		MANAGER, RECEPTIONIST, PROGRAMMER
	};

	private boolean onHoliday;
	private String name;
	private HashSet<Person.Skill> skills = new HashSet<Person.Skill>();

	public Person(String name, String... skills) {
		this.setName(name);
		for (var skill : skills) {
			if (skill.equalsIgnoreCase(Skill.MANAGER.toString())) {
				this.setSkill(skill);
			} else if (skill.equalsIgnoreCase(Skill.RECEPTIONIST.toString())) {
				this.setSkill(skill);
			} else if (skill.equalsIgnoreCase(Skill.PROGRAMMER.toString())) {
				this.setSkill(skill);
			}

		}
	}

	/**
	 * @return the skill
	 */
	public String getSkill() {
		StringBuilder sb = new StringBuilder();
		for (var skill : skills) {
			sb.append(skill + ", ");
			;
		}
		sb.substring(0, sb.length() - 2);
		return sb.toString();
	}

	/**
	 * @param skill the skill to set
	 */
	public void setSkill(String skill) {
		if (skill.equalsIgnoreCase(Skill.MANAGER.toString())) {
			this.skills.add(Skill.MANAGER);
		} else if (skill.equalsIgnoreCase(Skill.PROGRAMMER.toString())) {
			this.skills.add(Skill.PROGRAMMER);
		}else if (skill.equalsIgnoreCase(Skill.RECEPTIONIST.toString())) {
			this.skills.add(Skill.RECEPTIONIST);
		} 

	}

	public boolean hasSkill(String skill) {

		if(skills.contains(Skill.valueOf(skill))) {
//			System.out.println(this.name + " has the skill " + skill);
			return true;
		}else {
//			System.out.println("Skill " + skill + " not found for " + this.name);
			return false;
		}
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

}
