package sm001.mod001;

import java.util.Date;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e = new Employee("이서명",3000.0,new Date(29,5,1995));
//		e.name="이서명";
//		e.salary=3000.0;
//		e.birthDate=new Date(5,29,1995);
		System.out.println(e.getDetails());
		
		Manager m = new Manager("백지윤",3500.0,new Date(7,7,1995),"마케팅부");
//		m.name="백지윤";
//		m.salary=3500.0;
//		m.birthDate=new Date(7,7,1995);
//		m.department="영업부";
		System.out.println(m.getDetails());
	}
}
