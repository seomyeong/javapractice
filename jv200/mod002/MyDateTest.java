package jv200.mod002;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate myBirthDay = new MyDate();
		
		myBirthDay.setYear(1993);
		myBirthDay.setMonth(8);
		myBirthDay.setDay(24);
		
//		System.out.println("�� ���� : " + myBirthDay.getYear() + "-" + myBirthDay.getMonth() + "-"+ myBirthDay.getDay());
		System.out.println("�� ���� : " + myBirthDay.getDetails());
	}		
}
//12�� ����ó������ �ʰ� 13�� ����ó�� �ϴ� ���� �� ������. �׸��� getDetails�� ������ �ƴ϶� �ٸ� �� ������  ������ε� ����� �� �ְ���. �̷��� �����ؼ� �����ϴ� ���� Oop �� ��ü���� ���α׷���.