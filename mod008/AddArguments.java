package jv200.mod008;

//java AddArguments 1 2 3 4
//run configuration -> 메인클래스를 해당 클래스로 변경 후 arguments탭에 1 2 3 4 를 입력하면 그대로 받아오게 됨
public class AddArguments {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=0; i<args.length; i++) {
			String arg = args[i];
		}
		for(String arg : args) { //args에서 arg하나를 받아온것과 똑같음. 자료형변수명 : 배열명 or 자료형 한 단계 아래의 자료형의 변수명 : 배열명
			sum=sum+Integer.parseInt(arg);
		}
		System.out.println("sum = "+sum);
	}
}
