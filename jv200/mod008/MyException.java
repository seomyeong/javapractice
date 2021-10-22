package jv200.mod008;

//사용자 정의 예외
public class MyException extends Exception{
	
	
	public MyException(String msg) {
		super("내가 만든 쓸 데 없는 예외");
	}
}
