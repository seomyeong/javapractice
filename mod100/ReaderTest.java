package jv200.mod100;

import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderTest {
	public static void main(String[] args) {
		System.out.println("Unix : Type ctrl-d or ctrl-c to exit \nWindow : ctrl-z to exit");
		
		try {
			InputStreamReader ir = new InputStreamReader(System.in); //byte�� char�� ��ȯ
			try {
				for(int readChar; (readChar = ir.read()) != -1; ) {
					if(readChar != 10 && readChar != 13) {
						System.out.print("�Է� : ");
						System.out.print((char)readChar); //char�� �ƴ� �͵��� ������ char�� ����ȯ. 
					}
					System.out.println("���ڰ� : "+readChar);
				}
			}finally{
				ir.close();
			}
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
