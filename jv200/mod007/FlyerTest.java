package jv200.mod007;

public class FlyerTest {

	public static void main(String[] args) {
//		Bird b = new Bird();
//		Airplane a = new Airplane();
		
		//Interface�� ����������ok. �θ��� ok
		Flyer b = new Bird();
		Flyer a = new Airplane();
		
		a.takeOff();
		a.land();
		a.fly();
/**		a.calcFuelEffiecency(); type�� Flyer�� ���¿����� ȣ�� �Ұ�. ��ü�� ���迡�� �θ�� �ڽ��� �𸣱� ������ ����ȯ �������
		����Ŭ���� Ÿ���� ���������� �ڼ�Ŭ������ �ν��Ͻ��� ���� �� �� ��� ����� ����� �� �ִ� ���� �ƴ϶� ����Ŭ������ �ִ� ����� ��밡��.**/
		
		Airplane air = (Airplane)a;
		air.calcFuelEffiecency();
		
		
		b.takeOff();
		b.land();
		b.fly();

	}

}
