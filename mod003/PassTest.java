package jv200.mod003;

public class PassTest {
	public static void changeInt(int value) {
		value=55;
	}
	
	public static void changeObjectRef(MyDate ref) {
		ref=new MyDate(1,1,2000);
	}
	public static void changeObjectAttr(MyDate ref) {
		ref.setDay(4);
	}
	public static void main(String[] args) {
		int val=11;
		changeInt(val);
		
		MyDate date = new MyDate(22,7,1990);
		changeObjectRef(date); 
		changeObjectAttr(date);
		System.out.println(date.getDetails());
		
	}
}
