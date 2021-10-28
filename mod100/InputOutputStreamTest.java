package jv200.mod100;

import java.io.IOException;

public class InputOutputStreamTest {
	public static void main(String[] args) {
		System.out.println("Unix : Type ctrl-d or ctrl-c to exit \nWindow : ctrl-z to exit");
		try {
			for(int readByte; (readByte = System.in.read()) != -1;) { //증감식x. IOException발생으로 인한 try-catch사용필수
				if(readByte != 10 && readByte !=13) {
					System.out.write(readByte);
					System.out.print(", ");
				}
				System.out.println(readByte);
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}			
	}
}