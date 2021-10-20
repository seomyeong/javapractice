package jv200.mod002;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate myBirthDay = new MyDate();		
		myBirthDay.setYear(2005);
		myBirthDay.setMonth(10);
		myBirthDay.setDay(23);
		
//		myBirthDay.year=2005;
//		myBirthDay.month=10;
//		myBirthDay.day=23;
//		
//		System.out.println("생년월일 = "+myBirthDay.year+"-"+myBirthDay.month+"-"+myBirthDay.day);
		System.out.println("생년월일 = "+myBirthDay.getDetails());
	}

}
