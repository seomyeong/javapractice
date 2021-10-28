package jv200.mod100;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamTest2 {
	public static void main(String[] args) {
		InputStream is = null;
		int totalBytes=0;
		
		byte[] buffer = new byte[12]; //enter���� �����Ͽ� 12���� ����
		try {
			try {
				is = new FileInputStream("char_stream.txt");
				for(int readBytes; (readBytes = is.read(buffer)) != -1; ) {
					for(int i=0; i<readBytes; i++) { //readBytes�� ������ �ִ� ���̱⶧���� .length��� x
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
