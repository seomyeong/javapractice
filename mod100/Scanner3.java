package jv200.mod100;

import java.io.FileInputStream;
import java.util.Scanner;
/**
 * txt������ Scanner�� �б�
 *
 */
public class Scanner3 {
	public static void main(String[] args) {
		Scanner s = null;
		try {
			s = new Scanner(new FileInputStream("char_stream.txt"));
			s.useDelimiter(System.getProperty("line.separator")); //line���� �о���̰ڴٴ� ��.
			String line = null;
			
			while(s.hasNext()) { //Iterator�� hasNext()�� �����ϰ� ��
				line = s.next();
				System.out.println(line);
			}
			s.close();
		}catch(Exception e) {
			
		}
	}
}
