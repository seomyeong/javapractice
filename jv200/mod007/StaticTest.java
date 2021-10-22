package jv200.mod007;
/**
 * static에 대해.
 * 
 * @author Administrator
 *
 */
public class StaticTest {
	public static final  double PI = 3.14; //final변수 = 상수
	public final int number; //여기서 바로 초기화해주던지 아니면 생성자에서 number=10; 으로 값을 넣어야한다.
	public int i;
	public int j;
	public static int k;
	static { //static initializer
		System.out.println("가장먼저 생성자보다 먼저 호출");
	}
	public StaticTest() {
		number=10;
		System.out.println("생성자 호출");
	}
	
	public static void doSomething() {
		System.out.println(k);//바로 i를 찍으면 오류가 남. i가 생성되지 않았는데 출력이 됐기 때문. 그래서 static메서드 안에는 iv를 사용할 수 없음
	}

	public static void main(String[] args) {
		StaticTest.doSomething(); //위치 ok .
		StaticTest t = new StaticTest();
		t.i=10;
		t.j=20;
		StaticTest.k=100;
		System.out.println(t.i);
		System.out.println(t.j);
		System.out.println(StaticTest.k);
//		t.doSomething();
//		StaticTest.doSomething();
		
		StaticTest u = new StaticTest();
		u.i=10;
		u.j=20;
//		u.k=100;
		System.out.println(u.i);
		System.out.println(u.j);
		System.out.println(StaticTest.k); //100
	}
}
