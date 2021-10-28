package jv200.mod006;

import java.util.Date;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name="유비";
		e.salary=3000.0;
		e.birthDate=new MyDate(3,3,1995);
//		String str = e.getDetails(); 출력방법 1
//		System.out.println(str);
		System.out.println(e.getDetails()); //출력방법2
		
		Manager m = new Manager();
		m.name="관우";
		m.salary=5000.0;
		m.birthDate = new MyDate(2,5,1995);
		m.department="영업부"; //자식클래스에서 오버라이딩을 했으므로 출력됨
		System.out.println(m.getDetails());
	}}
