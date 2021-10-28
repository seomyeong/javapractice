package jv200.mod100;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
	public static void main(String[] args) {
		/*InputStream은 FileInputStream의 조상. 
		 * 그래서 is = new FileInputStream("char_stream.txt");은 부모타입이 자손객체를 담은것. 다형성 적용*/
		int totalBytes = 0;
		try (FileInputStream is = new FileInputStream("char_stream.txt");) {
				for(int readByte; (readByte = is.read()) != -1;){
					System.out.write(readByte);
					totalBytes++;				
			}
		}catch (IOException e) { //부모가 모든 에러를 잡도록.
			e.printStackTrace();
		} 
		System.out.println("totalBytes : "+totalBytes);
	}
}