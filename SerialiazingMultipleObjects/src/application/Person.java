package application;

import java.io.Serializable;

class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int id1;
	private transient int id2;
	private Integer id3;
	private transient Integer id4;
	
	public Person(String name, int id) {
		this.name = name;
		this.id1 = id;
		this.id2 = 100;
		this.id3 = 200;
		this.id4 = 300;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id1=" + id1 + ", id2=" + id2 + ", id3=" + id3 + ", id4=" + id4 + "]";
	}
	
	
}
