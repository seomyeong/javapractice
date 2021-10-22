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
		if(m > 0 && m < 13) {
			month = m;
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int y) {
		if(y > 0) {
			year = y;
		}
	}
	//MyDate date = new MyDate();
	//date.day = 32; (X)
	//date.setDay(32);
	
	public String getDetails() { 
		return year + "-" + month + "-" + day;
	}	
}
