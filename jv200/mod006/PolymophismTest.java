package jv200.mod006;

public class PolymophismTest {
	public static void main(String[] args) {
		Employee e = new Manager(); //데이터타입 : Employee, Manager객체의 값을 받음.
		e.name = "James Bond";
//		e.department="MI6";
		System.out.println(e.getDetails()); 
		//컴파일시점에서는 부모의 getDetails를 찾는다. 부모에 getDetails가 있으면 에러X
		/*e.getDetails()는 Manager값이 불러와진다. 
		이것은 Manager클래스에서 오버라이딩했기 때문에 찍힘.
		Manager클래스에서 오버라이딩을 하지 않는다면 Employee(부모클래스)의 getDetails를 불러온다.
		*/
	}
	
}
