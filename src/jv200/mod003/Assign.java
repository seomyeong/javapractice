package jv200.mod003;

public class Assign {
	public static void main(String[] args) {
		//정수 타입 선언
		int x;
		int y;
		//floating
		float z= 3.14f;
		//double
		double w = 3.14;
		//boolean
		boolean truth = true;
		//chart
		char c = 'A';
		String str = "A";
		
		z=-1;
		byte b = 10;
		x=b; //작은 사이즈가 큰 사이즈에 담기는 것은 가능
		b=(byte)x; //casting. x를 byte로 바꾸면 b에 값을 넣을 수 있다. 
		
		long l=100000;
		float f=100000;
	}
}
