package jv200.mod100;

import java.util.Scanner;

public class Scanner2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //Scanner�ȿ� �Է°��̳� ���� ���� ���� �� �ִ�.
		String param = s.next();
		int value = s.nextInt(); //
		boolean flag = s.nextBoolean();
		
		System.out.println("param : "+param);
		System.out.println("value : "+value);
		System.out.println("flag : "+flag);
		s.close();
	}
}
