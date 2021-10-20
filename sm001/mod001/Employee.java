package sm001.mod001;

import java.util.Date;

public class Employee {
	public String name="";
	public double salary;
	public Date birthDate;
	
	public Employee(String name, double salary, Date birthDate) {
//		System.out.println("부모생성");
		super();
		this.name=name;
		this.salary=salary;
		this.birthDate=birthDate;
	}
	
	public String getDetails() {
		return "이름 : "+name+"\n연봉 : "+salary+"\n생일 : "+birthDate;
	}
}
