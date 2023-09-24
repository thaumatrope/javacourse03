package application;

public class Cat {
	private String name;
	public static final String FOOD = "Cat food";
	private static int count = 0; 
	private final int id;

	/**
	 * @return the count
	 */
	public static int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public static void setCount(int count) {
		Cat.count = count;
	}

	public Cat(String name) {
		Cat.setCount(count + 1);
		this.name = name;
		this.id = Cat.getCount();
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
	}
}
