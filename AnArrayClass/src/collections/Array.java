package collections;

public class Array<T> {

	private T[] array;
	int position = 0;

	@SuppressWarnings("Unchecked")
	public Array(int length) {

		// array = new T[length]; cannot created a generic type array
		array = (T[]) new Object[length];
	}

	public void add(T t) {

		if (position == array.length) {
			throw new ArrayIndexOutOfBoundsException();
		}

		array[position++] = t;

	}

	public T get(int index) {

		if (index >= array.length) {
			throw new ArrayIndexOutOfBoundsException();
		}

		return array[index];
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (T tt : array) {
			if (tt != null) {
				sb.append(tt.toString());
				sb.append(", ");
			}			
		}
		return sb.toString().substring(0, sb.toString().length() - 2);
	}
}
