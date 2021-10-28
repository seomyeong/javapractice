package jv200.mod007;

public class Airplane extends Vehicle implements Flyer{

	@Override
	public double calcFuelEffiecency() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcTripDistance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void takeOff() {
		System.out.println("Airplane ÀÌ·ú");
		
	}

	@Override
	public void land() {
		System.out.println("Airplane Âø·ú");
		
	}

	@Override
	public void fly() {
		System.out.println("Airplane ³¯±â");
		
	}
	
}
