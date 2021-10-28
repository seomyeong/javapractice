package jv200.mod002;

import java.lang.*;

public class Foo {
	//속성
	private int x;
	private float y = 1000.0f;
	private String name = "Korea";
	
	
	//생성자 (객체 생성의 역할 / 반드시 생성자의 이름은 클래스명과 같아야 한다. and return 타입 자체가 없다.)	
	public Foo() { 
		System.out.println("생성자:Constructor");
	}
	
	//메소드 ( 속성, 생성자, 메소드의 순서는 바뀔 수 있다. )
	public void sayHello() { 
		int x = 100; // 지역번수 (local variable)
		System.out.println("Hello.");
	}
	public int add(int x, int y) { 
		int result = x + y;
		return result;
	}
}

//클래스 바로 밑에서 선언되어 있는 것들(생성자 제외)을 멤버 라고도 부른다. (정확한 정의 no, 쉽게 설명 위한 것)
//그러면 멤버 속성, 멤버 메소드가 있는데 메소드를 멤버 메소드라 부르지는 않기 때문에 속성을 멤버 variable 이라고 생각하면 된다.
// 멤버: 생성된 자바 객체가 가지고 있는 속성과 메소드(정확한 설명)
//1898 1967 1981
