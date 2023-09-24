package game.objects;

public class GameObject {
	
	private int id;
	private String name;
	/**
	 * @return the id
	 */
	protected int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	protected void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	protected String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	protected void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "GameObject [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
