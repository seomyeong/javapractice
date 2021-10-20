package jv200.mod006;

//상속
public class Manager extends Employee {
	public String department;
	
	//부모가 가지고있는 메소드를 자식클래스가 본인에 맞게 재정의하는 것 : 메소드 오버라이딩
	//메소드 오버라이딩. 그러나 그대로 복사해오는 것은 좋은 코드가 아님
//	public String getDetails() {
//		return "이름 : "+name+"\n연봉 : "+salary+"\n생일 : "+birthDate+"\ndepartment : "+department;
//	}
	
	//super를 활용해서 오버라이딩
	public String getDetails() {
		return super.getDetails() + "\nDepartment : "+department;
	}

}
