package jv200.mod007;
/**
 * static�� ����.
 * 
 * @author Administrator
 *
 */
public class StaticTest {
	public static final  double PI = 3.14; //final���� = ���
	public final int number; //���⼭ �ٷ� �ʱ�ȭ���ִ��� �ƴϸ� �����ڿ��� number=10; ���� ���� �־���Ѵ�.
	public int i;
	public int j;
	public static int k;
	static { //static initializer
		System.out.println("������� �����ں��� ���� ȣ��");
	}
	public StaticTest() {
		number=10;
		System.out.println("������ ȣ��");
	}
	
	public static void doSomething() {
		System.out.println(k);//�ٷ� i�� ������ ������ ��. i�� �������� �ʾҴµ� ����� �Ʊ� ����. �׷��� static�޼��� �ȿ��� iv�� ����� �� ����
	}

	public static void main(String[] args) {
		StaticTest.doSomething(); //��ġ ok .
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
