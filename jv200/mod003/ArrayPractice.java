package jv200.mod003;

public class ArrayPractice {

	public static void main(String[] args) {
		for(int i=0; i<args.length; i++) { // .length 사용하는 것이 더 유연한 코드
			System.out.println(args[i]);
		}
		
		
		char[] s = new char[26];
		for(int i = 0; i < s.length; i++) {
			s[i] = (char)('A'+i); // chasting. 형변환
		}
		System.out.println(s[0]);
	}

}