package jv200.mod004;

import java.util.Date; 

public class Employee {
	public String name = "";
	public double salary;
	public Date birthDate;
	
	
	public Employee() { // ����Ʈ ������
		
	}
	
	public Employee(String name, double salary, Date birthDate) {
		this.name = name;
		this.salary = salary;
		this.birthDate = birthDate;
	}
	
	public String getDetails() { 
		return "�̸�: "+name+"\n����: "+salary+ "\n����: "+ birthDate;
	}
	
}
	
	
	
