package jv200.mod007;

public class Bird implements Flyer{

	@Override
	public void takeOff() {
		System.out.println("Bird �̷�");
	}

	@Override
	public void land() {
		System.out.println("Bird ����");
	}

	@Override
	public void fly() {
		System.out.println("Bird ����");
	}

}
