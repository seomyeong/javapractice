package jv200.mod100;

import java.io.FileInputStream;
import java.util.Scanner;
/**
 * txt파일을 Scanner로 읽기
 *
 */
public class Scanner3 {
	public static void main(String[] args) {
		Scanner s = null;
		try {
			s = new Scanner(new FileInputStream("char_stream.txt"));
			s.useDelimiter(System.getProperty("line.separator")); //line별로 읽어들이겠다는 뜻.
			String line = null;
			
			while(s.hasNext()) { //Iterator의 hasNext()와 동일하게 씀
				line = s.next();
				System.out.println(line);
			}
			s.close();
		}catch(Exception e) {
			
		}
	}
}
