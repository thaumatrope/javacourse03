package entities;

public class Fruit {
	
	protected int id; // access only in the same package

	@Override
	public String toString() {
		return "Fruit [id=" + id + "]";
	}
}
