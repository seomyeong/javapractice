package jv200.mod003;

public class MyDateTest {

	public static void main(String[] args) {
//		MyDate d = new MyDate();
//		���� ������ ��. �̰��� argument�� ���� �ʴ� �����ڰ� ����. 
//		��, ������ ���� �������� argument�� ������ ��� �־��ְų� Ȥ�� argument�� ���� �����ڸ� �ϳ� �� �����.
//		���⼭ �� �� �ִ� ���� �����ڰ� 1���� �ƴ� �� �ִٴ� ��.
		
//		MyDate d = new MyDate(26, 10, 2000);
//		MyDate t = new MyDate(3, 7, 1999);
		 
//		t = d; // 3, 7, 1999 ���� �޸� �� ���������� ����Ű�� ���� ����. �׷��� �����ϴ°��� ��� garbage collector�� ������ ��������.
//		26, 10, 2000 / 3, 7, 1999 ��ü�� �ΰ��� �����Ǵµ� t =d �� t ��ü�� d ���� �����ϴ°� �ƴ϶� ������ó�� d ��ü�� �����ϴ� �� �ּҰ��� t�� �ְԵ�.  
		
//		System.out.println(d.getDetails());


		MyDate d = new MyDate(26,10,2000);
		MyDate d2 = d.addDays(3);
		
		System.out.println(d2.getDetails());
		System.out.println(d2.toString());

	}

}
