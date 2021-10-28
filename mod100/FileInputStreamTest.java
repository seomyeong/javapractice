package jv200.mod100;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
	public static void main(String[] args) {
		/*InputStream�� FileInputStream�� ����. 
		 * �׷��� is = new FileInputStream("char_stream.txt");�� �θ�Ÿ���� �ڼհ�ü�� ������. ������ ����*/
		int totalBytes = 0;
		try (FileInputStream is = new FileInputStream("char_stream.txt");) {
				for(int readByte; (readByte = is.read()) != -1;){
					System.out.write(readByte);
					totalBytes++;				
			}
		}catch (IOException e) { //�θ� ��� ������ �⵵��.
			e.printStackTrace();
		} 
		System.out.println("totalBytes : "+totalBytes);
	}
}