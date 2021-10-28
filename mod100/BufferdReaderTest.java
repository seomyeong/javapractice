package jv200.mod100;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferdReaderTest {
	public static void main(String[] args) {
		BufferedReader bis = null;
		try {
			try {
				bis = new BufferedReader(new FileReader("char_stream.txt"));
				System.out.println("\n-파일내용-");
				for(String line; (line = bis.readLine()) != null;) {
					System.out.println(line);
				}
			}finally {
				bis.close();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
