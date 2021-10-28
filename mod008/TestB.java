package jv200.mod008;

import java.io.EOFException;
import java.io.IOException;
import java.sql.SQLException;

public class TestB extends TestA{
//	@Override
//	public void methodA() throws IOException{
//		
//	} 가능
//	@Override
//	public void methodA() throws IOException, SQLException{
//		
//	} // 불가능: 메소드 오버라이딩과 throws절 첫번째 설명에 대한 내용
	
	@Override
	public void methodA() throws EOFException{
		
	} // 가능 : 두번째 줄에 대한 설명. ( EOFException은 IOException 예외의 자식 예외 라서 가능) 

}
