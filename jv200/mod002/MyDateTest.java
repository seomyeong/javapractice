package jv200.mod002;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate myBirthDay = new MyDate();
		
		myBirthDay.setYear(1993);
		myBirthDay.setMonth(8);
		myBirthDay.setDay(24);
		
//		System.out.println("내 생일 : " + myBirthDay.getYear() + "-" + myBirthDay.getMonth() + "-"+ myBirthDay.getDay());
		System.out.println("내 생일 : " + myBirthDay.getDetails());
	}		
}
//12번 라인처럼하지 않고 13번 라인처럼 하는 것이 더 편하지. 그리고 getDetails를 생일이 아니라 다른 뭐 졸업일  등등으로도 사용할 수 있겠지. 이렇게 생각해서 설계하는 것이 Oop 즉 객체지향 프로그래밍.