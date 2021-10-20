package sm001.mod001;

import java.util.Date;

public class Manager extends Employee {
	public String department;
	
	public Manager(String name, double salary, 
			Date birthDate, String department) {
//		System.out.println("자식생성");
		super(name,salary,birthDate);
		this.department=department;
	}
	
	//오버라이딩
	public String getDetails() {
		return super.getDetails()+"\n소속 : "+department;
	}

}
