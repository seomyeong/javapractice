package jv200.mod003;

public class ArrayPractice {

	public static void main(String[] args) {
		for(int i=0; i<args.length; i++) { // .length ���
			System.out.println(args[i]);
		}
		
		
		char[] s = new char[26];
		for(int i = 0; i < s.length; i++) {
			s[i] = (char)('A'+i); // chasting. ����ȯ. 
		}
		System.out.println(s[0]);
	}

}
