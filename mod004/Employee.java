package jv200.mod004;

import java.util.Date; 

public class Employee {
	public String name = "";
	public double salary;
	public Date birthDate;
	
	
	public Employee() { // 디폴트 생성자
		
	}
	
	public Employee(String name, double salary, Date birthDate) {
		this.name = name;
		this.salary = salary;
		this.birthDate = birthDate;
	}
	
	public String getDetails() { 
		return "이름: "+name+"\n월급: "+salary+ "\n생일: "+ birthDate;
	}
	
}
	
	
	
