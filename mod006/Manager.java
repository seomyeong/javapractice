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
	public Manager() { // ����Ʈ ������
		super(); // �θ��� ������. ����.
	}
	
	public Manager(String name, double salary, MyDate birthDate, String department) {
		super(name, salary, birthDate);
		this.department = department;
	}
	
	public String getDetails() { 
//		return "�̸�: "+name+"\n����: "+salary+ "\n����: "+ birthDate + "department : " + department;
		return super.getDetails()+ "\ndepartment : " + department;
	}
}