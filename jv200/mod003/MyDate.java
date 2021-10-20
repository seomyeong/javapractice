package jv200.mod003;

//주석 연습


/**
 * 이 클래스에 대한 설명
 * 
 * @author 82108
 *
 */

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate(int d, int m, int y) {
		day = d;
		month = m;
		year = y;
	}
	/**
	 * 이 메소드에 대한 설명
	 * @return
	 */
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
