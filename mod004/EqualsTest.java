package jv200.mod004;

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
