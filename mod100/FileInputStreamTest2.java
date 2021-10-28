package jv200.mod100;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamTest2 {
	public static void main(String[] args) {
		InputStream is = null;
		int totalBytes=0;
		
		byte[] buffer = new byte[12]; //enter까지 포함하여 12개를 잡음
		try {
			try {
				is = new FileInputStream("char_stream.txt");
				for(int readBytes; (readBytes = is.read(buffer)) != -1; ) {
					for(int i=0; i<readBytes; i++) { //readBytes가 실제로 있는 값이기때문에 .length사용 x
						System.out.write(buffer[i]);
					}
					System.out.println("\n-------------------------");
					totalBytes+=readBytes;
				}
				System.out.println("totalBytes : "+totalBytes);
			}finally {
				is.close();
			}
		}catch(Exception e) {
			System.out.println();
		}
}
}
