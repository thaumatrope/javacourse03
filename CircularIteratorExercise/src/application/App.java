package application;

import java.util.Iterator;

class RingBuffer<E> implements Iterable<E>{
	
	private E[] buffer;
	private int index = 0;

	
	private class RingBufferIterator implements Iterator<E>{
		
		
		private int itemsToRead =  RingBuffer.this.size();
		private int readIndex = (index >= itemsToRead) ? 0 : index ;

		@Override
		public boolean hasNext() {

			if(itemsToRead > 0) {
				if(readIndex >= buffer.length) 
					readIndex = 0;					
				return true;
				
			}else {
				return false;
			}

		}

		@Override
		public E next() {
			itemsToRead--;
			return buffer[readIndex++];
		}
		
		
	}

	
	@SuppressWarnings("unchecked")
	public RingBuffer(int size) {
		buffer = (E[]) new Object[size];

		System.out.println("RingBuffer created with length: " + buffer.length);

	}

	public void add(E element) {
		
		if(index >= buffer.length)
			index = 0;
		
		buffer[index] = element;
		index += 1;	
		
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

	@Override
	public Iterator<E> iterator() {
		return new RingBufferIterator();
	}
}

public class App {

	public static void main(String[] args) {

		RingBuffer<Integer> buff = new RingBuffer(5);

		System.out.println("RingBuffer size is: " + buff.size());
		buff.add(7);
		System.out.println(buff);
		System.out.println("RingBuffer size is: " + buff.size());
		
		buff.add(33);
		System.out.println(buff);
		System.out.println("RingBuffer size is: " + buff.size());
		buff.add(44);
		System.out.println(buff);
		System.out.println("RingBuffer size is: " + buff.size());

		buff.add(-22);
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
		
		
		for(var item = buff.iterator(); item.hasNext(); ) {
			System.out.println(item.next());
		}

	}

}
