package jv200.mod006;

import java.util.Date;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name="����";
		e.salary=3000.0;
		e.birthDate=new MyDate(3,3,1995);
//		String str = e.getDetails(); ��¹�� 1
//		System.out.println(str);
		System.out.println(e.getDetails()); //��¹��2
		
		Manager m = new Manager();
		m.name="����";
		m.salary=5000.0;
		m.birthDate = new MyDate(2,5,1995);
		m.department="������"; //�ڽ�Ŭ�������� �������̵��� �����Ƿ� ��µ�
		System.out.println(m.getDetails());
	}}
