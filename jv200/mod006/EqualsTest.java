package jv200.mod006;

public class EqualsTest {

	public static void main(String[] args) {
		Employee e = new Employee();
		Employee e2 = new Employee();
		
		if(e == e2) { // "다르다"출력됨
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		if(e.equals(e2)) { //다향성에 의해 e2가 들어갈 수 있는 것임. "다르다"출력
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		//--------------------------------
		String s = new String("홍길동");
		String s2 = new String("홍길동");
		
		if(s == s2) { //다르다
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		//String클래스는 value가 같으면 같다고 출력됨
		if(s.equals(s2)) { //같다
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}

		
	}

}
