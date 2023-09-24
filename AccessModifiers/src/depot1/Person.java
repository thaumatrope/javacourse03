package depot1;

public class Person {
	public String name;	   // access everywhere
	private String name2;  //access only in the same class
	protected String name3; //access same class, subclasses and same package
	String name4; // no access modifier, access same class or package
	
	/**
	 * @return the name4
	 */
	public String getName4() {
		return name4;
	}

	/**
	 * @param name4 the name4 to set
	 */
	public void setName4(String name4) {
		this.name4 = name4;
	}

	public Person(String name, String name2, String name3, String name4) {
		this.name = name;
		this.name2 = name2;
		this.name3 = name3;
		this.name4 = name4;
	}

	/**
	 * @return the name3
	 */
	public String getName3() {
		return name3;
	}

	/**
	 * @param name3 the name3 to set
	 */
	public void setName3(String name3) {
		this.name3 = name3;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", name2=" + name2 + ", name3=" + name3 + ", name4=" + name4 + "]";
	}

	/**
	 * @return the name2
	 */
	public String getName2() {
		return name2;
	}

	/**
	 * @param name2 the name2 to set
	 */
	public void setName2(String name2) {
		this.name2 = name2;
	}

}
