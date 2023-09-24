package game.objects;

public class GameObject implements Comparable<GameObject>{

	private int id;
	private String name;

	private int[][] comparison = {

			// @formatter:off
			//         		rock paper scissors
			/*rock*/		{0,		-1,		1},
			/*paper	*/		{1,		0,		-1},
			/*scissors*/	{-1,	1,		0}
			// @formatter:on

	};
	
	@Override
	public int compareTo(GameObject other) {
		return comparison[id][other.id];
	}

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
