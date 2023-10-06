package collections;

public class Pair <T, S>{
	
	private T value1;
	private S value2;
	
	public Pair(T value1, S value2) {
		this.value1 = value1;
		this.value2 = value2;
		
	}

	public T getValue1() {
		return value1;
	}

	public void setValue1(T value1) {
		this.value1 = value1;
	}

	public S getValue2() {
		return value2;
	}

	public void setValue2(S value2) {
		this.value2 = value2;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(value1.toString());
		sb.append(", ");
		sb.append(value2.toString());
		
		return sb.toString();
	}

}
