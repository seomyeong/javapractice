package jv200.mod100;

import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderTest {
	public static void main(String[] args) {
		System.out.println("Unix : Type ctrl-d or ctrl-c to exit \nWindow : ctrl-z to exit");
		
		try {
			InputStreamReader ir = new InputStreamReader(System.in); //byte를 char로 전환
			try {
				for(int readChar; (readChar = ir.read()) != -1; ) {
					if(readChar != 10 && readChar != 13) {
						System.out.print("입력 : ");
						System.out.print((char)readChar); //char가 아닌 것들이 들어오면 char로 형변환. 
					}
					System.out.println("숫자값 : "+readChar);
				}
			}finally{
				ir.close();
			}
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
