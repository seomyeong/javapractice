package jv200.mod002;

public class myDateTest {

	public static void main(String[] args) {
		MyDate myBirthDay = new MyDate();		
		myBirthDay.setYear(2005);
		myBirthDay.setMonth(10);
		myBirthDay.setDay(23);

		System.out.println("생년월일 = "+myBirthDay.getDetails());
	}

}
