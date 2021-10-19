package jv200.mod003;


/**
 *
 *
 * 이 클래스에 대한 설명
 *
 * @author Administrator
 *
 *         연도, 월, 일을 받아 넣는 클래스.
 * 
 **/

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate(int day, int month, int year) { 
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public MyDate(MyDate date) {
		this.day=date.day;
		this.month=date.month;
		this.year=date.year;
	}
	
	public MyDate addDays(int moreDays) {
		MyDate newMyDate = new MyDate(this);
		newMyDate.day=newMyDate.day + moreDays;
		
		return newMyDate;
	}
	
	
	
	
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
