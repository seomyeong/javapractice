package jv200.mod004;

import java.util.Date;

public class EmployeeTest {
	public static void main(String[] args) {
//		Employee e1 = new Manager();
//		e1.
		
		Employee e = new Employee();
		e.name = "유비";
		e.salary = 3000.0;
		e.birthDate = new Date();
		System.out.println(e.getDetails()+"\n");
		
		Manager m = new Manager(); // 이거 한 줄 불려질 때 Manager 생성자 불러지면서 부모도 만들고 자식도 만듬
		m.name = "관우";
		m.salary = 5000.0;
		m.birthDate = new Date();
		m.department = "영업부";
		System.out.println(m.getDetails());
		
		Manager m2 = new Manager("장비", 4000.0, new Date(), "홍보부");
		
		System.out.println(m2.getDetails());
	}
}
