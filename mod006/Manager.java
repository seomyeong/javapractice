package jv200.mod006;

import java.util.Date; 

public class Manager extends Employee{
	public String department;
	
	//
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	//
	public Manager() { // 디폴트 생성자
		super(); // 부모의 생성자. 생략.
	}
	
	public Manager(String name, double salary, MyDate birthDate, String department) {
		super(name, salary, birthDate);
		this.department = department;
	}
	
	public String getDetails() { 
//		return "이름: "+name+"\n월급: "+salary+ "\n생일: "+ birthDate + "department : " + department;
		return super.getDetails()+ "\ndepartment : " + department;
	}
}