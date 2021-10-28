package jv200.mod004;

import java.util.Date;

public class EqualsTest2 {

	public static void main(String[] args) {
		Employee e = new Employee("관우",3000.0,new Date(1995,5,29));
		Employee e2 = new Employee("관우",3000.0,new Date(1995,5,29));
		
//		System.out.println(e.getDetails());
		
		if(e == e2) {
			System.out.println("e==e2이 같다");
		}else {
			System.out.println("e==e2이 다르다");
		}
		
		if(e.equals(e2)) {
		System.out.println("e.equals(e2)이 같다");
		}else {
		System.out.println("e.equals(e2)이 다르다");
		}
		
		System.out.println("-------------");
	}

}
