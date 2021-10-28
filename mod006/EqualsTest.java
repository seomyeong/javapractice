package jv200.mod006;

public class EqualsTest {
	public static void main(String[] args) {
		Employee e = new Employee();
		Employee e2 = new Employee();
		
		if(e == e2) { // reference is different.
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		if(e.equals(e2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
	
	//------------------------------------------------------
		System.out.println("----------------------");
		String s = new String("홍길동");
		String s2 = new String("홍길동");
		
		if(s == s2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		if(s.equals(s2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		System.out.println("----------------------");
		String s3 = "홍길동";
		String s4 = "홍길동";
		
		if(s3 == s4) {
			System.out.println("s3==s4는 같다");
		}else {
			System.out.println("s3==s4는 다르다");
		}
		
		if(s3.equals(s4)) {
			System.out.println("s3.equals s4는 같다");
		}else {
			System.out.println("s3.equals s4는 다르다");
		}

	}
}
// Employee 클래스 안에는 equals() 메소드가 없다. 근데 e.equals() 이렇게 사용 할 수 있나? 답은 있다. 뭐 때문에? 상속 때문에.
// e.equals() 여기 파라미터는 Object 타입인데 우리는 e와 e2를 비교하고 싶다. 그런데 e2는 Employee 타입이다 그러면 파라미터로 e2가 들어갈 수 있나? 답은 있다. 뭐때문에? 다형성 때문에
