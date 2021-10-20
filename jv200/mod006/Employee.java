package jv200.mod006;

import java.util.Date;

public class Employee {
	public String name = "";
	public double salary;
	public Date birthDate;
	
	public String getDetails() {
		return "이름 : "+name+"\n연봉 : "+salary+"\n생일 : "+birthDate;
	}
}
