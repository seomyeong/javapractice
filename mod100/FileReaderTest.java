package jv200.mod100;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) {
		FileReader fis = null;
		File file = new File("char_stream.txt"); //파일도 객체가 될 수 있음
		
		System.out.println("\nsize = "+file.length()+"Bytes"); //파일사이즈
		System.out.println("path"+file.getAbsolutePath()+"\n"); //파일경로

		try {
			fis = new FileReader(file); //위에서 선언한 File타입 file명으로 넣어도 출력됨
			try {
				System.out.println("-파일내용-");

				for(int readChar; (readChar = fis.read()) != -1;) {
					if(readChar != 10 && readChar != 13) { //enter키가 아닌것은 출력
						System.out.print((char)readChar);
					}else if(readChar == 10) { //enter키는 출력x
						continue;
					}else{
						System.out.println();
					}
				}
			}finally{
				fis.close();
			}
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
