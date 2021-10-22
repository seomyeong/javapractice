package jv200.mod007;

public class Dog extends Pet {
	
	public Dog(String type, boolean male) {
		super(type,male);
	}
	
	@Override
	public void cry() {
		System.out.println("¸Û¸Û");
	}
}
