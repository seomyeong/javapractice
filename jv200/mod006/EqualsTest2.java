package jv200.mod006;

public class EqualsTest2 {
	public static void main(String[] args) {
		Employee e = new Employee("����",1000.0,new MyDate(23,10,2000));
		Employee e2 = new Employee("����",1000.0,new MyDate(23,10,2000));
		
		if(e == e2) { // reference is different.
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		//equals ���� '����'�� ����� �ǵ��� �ϱ�
		if(e.equals(e2)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
	
	}
}
