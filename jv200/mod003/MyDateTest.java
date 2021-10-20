package jv200.mod003;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate d = new MyDate(26,10,2000); //argument를 받아주지 않으면 에러가 남
		MyDate t = new MyDate(3,7,1999);
		t=d;
		System.out.println(t.getDetails());
	}

}
