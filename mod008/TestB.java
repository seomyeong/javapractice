package jv200.mod008;

import java.io.EOFException;
import java.io.IOException;
import java.sql.SQLException;

public class TestB extends TestA{
//	@Override
//	public void methodA() throws IOException{
//		
//	} ����
//	@Override
//	public void methodA() throws IOException, SQLException{
//		
//	} // �Ұ���: �޼ҵ� �������̵��� throws�� ù��° ���� ���� ����
	
	@Override
	public void methodA() throws EOFException{
		
	} // ���� : �ι�° �ٿ� ���� ����. ( EOFException�� IOException ������ �ڽ� ���� �� ����) 

}
