package jv200.mod009;

import java.util.HashSet;
import java.util.Set;

public class GenericSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>(); // StringŸ������ �����Ѱ� 
		set.add("one");
		set.add("two");
		set.add("3rd"); 
//		set.add(new Integer(4)); Ÿ���� �޶� ���⼭�� ������ ������ ����. 
	}
	//Q. ���׸����� String�� ������ �Ŀ� ���� �̿ܿ� �ٸ� Ÿ���� �Է� �ް� ���� ��쿡�� ��� �ؾ��ϳ���?
	//Q. Ȥ�� ���� Ÿ���� �Է¹ް� ������ ���׸����� ��� �� �� �ֳ���? 
}
