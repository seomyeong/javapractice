package jv200.mod007;

public class FlyerTest {

	public static void main(String[] args) {
//		Bird b = new Bird();
//		Airplane a = new Airplane();
		
		//Interface도 다형성적용ok. 부모역할 ok
		Flyer b = new Bird();
		Flyer a = new Airplane();
		
		a.takeOff();
		a.land();
		a.fly();
/**		a.calcFuelEffiecency(); type이 Flyer인 상태에서는 호출 불가. 객체의 세계에서 부모는 자식을 모르기 때문에 형변환 해줘야함
		조상클래스 타입의 참조변수가 자손클래스의 인스턴스를 참조 할 때 모든 멤버를 사용할 수 있는 것이 아니라 조상클래스에 있는 멤버만 사용가능.**/
		
		Airplane air = (Airplane)a;
		air.calcFuelEffiecency();
		
		
		b.takeOff();
		b.land();
		b.fly();

	}

}
