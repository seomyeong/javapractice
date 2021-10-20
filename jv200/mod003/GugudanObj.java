package jv200.mod003;

public class GugudanObj {
	private int num1;
	private int num2;
	private int result;
	
	public int GugudanTest(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
		result=num1*num2;
		return result;
	}
	
	public void getGugudan() {
		System.out.print(num1+"*"+num2+"="+result+"\t");
	}

}
