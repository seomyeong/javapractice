package jv200.mod006;

public class EqualsTest {
	public static void main(String[] args) {
		Employee e = new Employee();
		Employee e2 = new Employee();
		
		if(e == e2) { // reference is different.
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		if(e.equals(e2)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
	
	//------------------------------------------------------
		System.out.println("----------------------");
		String s = new String("ȫ�浿");
		String s2 = new String("ȫ�浿");
		
		if(s == s2) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		if(s.equals(s2)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		System.out.println("----------------------");
		String s3 = "ȫ�浿";
		String s4 = "ȫ�浿";
		
		if(s3 == s4) {
			System.out.println("s3==s4�� ����");
		}else {
			System.out.println("s3==s4�� �ٸ���");
		}
		
		if(s3.equals(s4)) {
			System.out.println("s3.equals s4�� ����");
		}else {
			System.out.println("s3.equals s4�� �ٸ���");
		}

	}
}
// Employee Ŭ���� �ȿ��� equals() �޼ҵ尡 ����. �ٵ� e.equals() �̷��� ��� �� �� �ֳ�? ���� �ִ�. �� ������? ��� ������.
// e.equals() ���� �Ķ���ʹ� Object Ÿ���ε� �츮�� e�� e2�� ���ϰ� �ʹ�. �׷��� e2�� Employee Ÿ���̴� �׷��� �Ķ���ͷ� e2�� �� �� �ֳ�? ���� �ִ�. ��������? ������ ������
