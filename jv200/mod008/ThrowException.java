package jv200.mod008;

/**
 * 모든 메서드(메인메서드 포함)에 throws MyException을 던진다면 컴파일에러는 뜨지않지만 실행시키면 에러가 뜨게되버림. 
 * try-catch를 어디에서 처리할 것인지에 대한 선택은 유동적이지만 지금 단계에서는 깊게 고민x
 * 1. throws MyException을 계속 전파시킬 수 있다.
 * 2. 어딘가에서 try-catch를 해줌으로써 에러처리를 할 수 있다.
 * @author Administrator
 *
 */
public class ThrowException {
	public static void main(String[] args) throws MyException {
		ThrowException te = new ThrowException();
		te.aMethod();
	}
	public void aMethod() throws MyException {
		bMethod();
	}
	public void bMethod() throws MyException { //cMethod()가 throws MyException이라는 예외를 발생시킬 수 있다고 작성되어있기 때문에 try-catch문으로 예외처리 하던지 MyException을 RuntimeException을 상속받게 하기
		cMethod();
	}
	public void cMethod() throws MyException { //사용자정의 예외 발생
		System.out.println("c");
	}
}
