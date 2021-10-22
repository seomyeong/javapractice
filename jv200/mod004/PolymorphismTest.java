package jv200.mod004;

import java.util.Date;

public class PolymorphismTest {
	public static void main(String[] args) {
		Employee e = new Manager(); //legal
		e.name = "James Bond";
		e.salary = 3000.0;
		e.birthDate = new Date();
//		e.department = "MI6";
		System.out.println(e.getDetails());
	}	

}
