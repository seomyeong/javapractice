package jv200.mod006;

import java.util.Date;

public class Employee {
	public String name = "";
	public double salary;
	public MyDate birthDate;
	
	
	public Employee() { // 디폴트 생성자
		
	}
	
	public Employee(String name, double salary, MyDate birthDate) {
		this.name = name;
		this.salary = salary;
		this.birthDate = birthDate;
	}
	public String getDetails() { 
		return "이름: "+name+"\n월급: "+salary+ "\n생일: "+ birthDate;
	}
	
	//equals 오버라이드
	public boolean equals(Object obj) {
		if(!(obj instanceof Employee)) {
			return false;
		}
		
	//obj를 Employee타입으로 형변환
	//birthDate도 오버라이드해야함. main메소드에서 또 new 객체로 myDate를 만들었기 때문에.
	Employee e = (Employee)obj; //다형성
	if(e.name.equals(this.name) && e.birthDate.equals(this.birthDate)) {
		return true;		
	}
	return false;
} 

	
}
