package jv200.mod002;
import java.lang.*;

public class Foo {
	//속성, Member variable
	private int x;
	private float y=1000.0f;
	private String name="Korea";
	
	//생성자
	public Foo() {
		System.out.println("생성자:Constructor");
	}

	//메소드
	public void sayHello() {
		int x=100; //지역변수(local variable)
		System.out.println("Hello.");
	}
	
	public void setX(int num) {
		x = num;
	}
	
	public String getName() {
		return name;
	}
	
	public int add(int x, int y) {
		int result = x + y;
		return result;
	}
}
