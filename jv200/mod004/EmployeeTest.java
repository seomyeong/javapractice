package jv200.mod004;

import java.util.Date;

public class EmployeeTest {
	public static void main(String[] args) {
//		Employee e1 = new Manager();
//		e1.
		
		Employee e = new Employee();
		e.name = "����";
		e.salary = 3000.0;
		e.birthDate = new Date();
		System.out.println(e.getDetails()+"\n");
		
		Manager m = new Manager(); // �̰� �� �� �ҷ��� �� Manager ������ �ҷ����鼭 �θ� ����� �ڽĵ� ����
		m.name = "����";
		m.salary = 5000.0;
		m.birthDate = new Date();
		m.department = "������";
		System.out.println(m.getDetails());
		
		Manager m2 = new Manager("���", 4000.0, new Date(), "ȫ����");
		
		System.out.println(m2.getDetails());
	}
}
