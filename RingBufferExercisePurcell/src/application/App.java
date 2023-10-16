package application;


class RingBuffer<E> {

	private E[] buffer;
	private int position = 0;

	@SuppressWarnings("unchecked")
	public RingBuffer(int size) {
		buffer = (E[]) new Object[size];

		System.out.println("RingBuffer created with length: " + buffer.length);

	}

	public void add(E element) {
		
		if(position >= buffer.length)
			position = 0;
		
		buffer[position] = element;
		position += 1;	
		
	}

	public Object get(int index) {

		if ((index < buffer.length) && (index >= 0)) {
			return buffer[index];
		} else {

			System.out.println("Index not within range!");
			return null;
		}

	}

	public int size() {
		int size = 0;
		for(var item: buffer) {
			if(item != null) {
				size++;
			}
		}

		return size;
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();

		for (var element : buffer) {
			sb.append(element + " / ");
		}

		return sb.toString();
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RingBuffer buff = new RingBuffer(4);

		System.out.println("RingBuffer size is: " + buff.size());
		buff.add(7);
		System.out.println(buff);
		System.out.println("RingBuffer size is: " + buff.size());
		buff.add(9);
		System.out.println(buff);
		System.out.println("RingBuffer size is: " + buff.size());
		buff.add(1);
		System.out.println(buff);
		System.out.println("RingBuffer size is: " + buff.size());
		buff.add(22);
		System.out.println(buff);
		buff.add(33);
		System.out.println(buff);
		System.out.println("RingBuffer size is: " + buff.size());
		buff.add(44);
		System.out.println(buff);
		System.out.println("RingBuffer size is: " + buff.size());

		buff.add(-22);
		System.out.println(buff);
		System.out.println("RingBuffer size is: " + buff.size());

	}

}
