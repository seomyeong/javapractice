package jv200.mod100;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) {
		FileReader fis = null;
		File file = new File("char_stream.txt"); //���ϵ� ��ü�� �� �� ����
		
		System.out.println("\nsize = "+file.length()+"Bytes"); //���ϻ�����
		System.out.println("path"+file.getAbsolutePath()+"\n"); //���ϰ��

		try {
			fis = new FileReader(file); //������ ������ FileŸ�� file������ �־ ��µ�
			try {
				System.out.println("-���ϳ���-");

				for(int readChar; (readChar = fis.read()) != -1;) {
					if(readChar != 10 && readChar != 13) { //enterŰ�� �ƴѰ��� ���
						System.out.print((char)readChar);
					}else if(readChar == 10) { //enterŰ�� ���x
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
