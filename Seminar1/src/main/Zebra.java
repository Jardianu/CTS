package main;

public class Zebra extends Animal {
	private int varsta;
	
	public Zebra(String name, int varsta) {
		super(name);
		this.varsta = varsta;
	}
	
	public Zebra(String name) {
		super(name);
		this.varsta = 4;
	}
}