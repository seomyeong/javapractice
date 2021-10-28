package jv200.mod006;

import java.util.Date;

public class Employee {
	public String name = "";
	public double salary;
	public MyDate birthDate;
	
	
	public Employee() { // ����Ʈ ������
		
	}
	
	public Employee(String name, double salary, MyDate birthDate) {
		this.name = name;
		this.salary = salary;
		this.birthDate = birthDate;
	}
	public String getDetails() { 
		return "�̸�: "+name+"\n����: "+salary+ "\n����: "+ birthDate;
	}
	
	//equals �������̵�
	public boolean equals(Object obj) {
		if(!(obj instanceof Employee)) {
			return false;
		}
		
	//obj�� EmployeeŸ������ ����ȯ
	//birthDate�� �������̵��ؾ���. main�޼ҵ忡�� �� new ��ü�� myDate�� ������� ������.
	Employee e = (Employee)obj; //������
	if(e.name.equals(this.name) && e.birthDate.equals(this.birthDate)) {
		return true;		
	}
	return false;
} 

	
}
