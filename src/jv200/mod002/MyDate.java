package jv200.mod002;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
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
}
