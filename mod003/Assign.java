package jv200.mod003;

public class Assign {

	public static void main(String[] args) {
		//정수 타입 선언
		int x;
		int y;
		
		//floating
		float z = 3.14f;
		//double
		double w = 3.14;
		//boolean
		boolean truth = true;
		//char 
		char c = 'A';
		String str = "A";

		z = -1;
		byte b = 10;
		x = b; // 가능. 작은 사이즈인 byte에서 int로 담기는 것은 가능하다. 반대는 안됨.
//		b = x; 에러남 큰사이즈를 작은 사이즈에 담는거니까. 하지만 아래처럼 하면 담을 수 있다. 
		b = (byte) x; // casting  ; 가능하다는것은 컴파일 되고 실행 된다는 것. 하지만 byte에 들어갈 수 없는 크기의 숫자를 넣으면 데이터가 깨진다.
		
	}

}
