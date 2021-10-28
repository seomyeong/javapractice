package jv200.mod006;

public class EqualsTest2 {
	public static void main(String[] args) {
		Employee e = new Employee("유비",1000.0,new MyDate(23,10,2000));
		Employee e2 = new Employee("유비",1000.0,new MyDate(23,10,2000));
		
		if(e == e2) { // reference is different.
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		//equals 값이 '같다'가 출력이 되도록 하기
		if(e.equals(e2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
	
	}
}
