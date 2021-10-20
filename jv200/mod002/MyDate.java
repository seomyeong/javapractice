package jv200.mod002;

public class MyDate {
	private int day;
	private int month;
	private int year;
	private char[] setDay;
	
	public int getDay() {
		return day;
	}
	public void setDay(int d) {
		if(d > 0 && d < 32) {
			day = d;			
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int m) {
		month = m;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int y) {
		year = y;
	}
	
	public String getDetails() {
		return year+"-"+month+"-"+day;
	}
	
	//main메소드를 만들어서 출력 가능
	public static void main(String[] args) {
		MyDate date = new MyDate();
		date.setDay(21);
		date.setMonth(3);
		date.setYear(2021);
			
		System.out.println(date.year+", "+date.month+", "+date.day);
		System.out.println(date.getDetails());
	}
	
}
