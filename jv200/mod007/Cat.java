package jv200.mod007;

public class Cat extends Pet {
	
	public Cat(String type, boolean male) {
		super(type,male);
		
	}
	
	
	@Override
	public void cry() {
		System.out.println("¾ß¿Ë");
	}
}
