package jv200.mod009;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set set = new HashSet();  // Set �� �������̽��� ��ü�� ���� �� ����. �׷��� Set�� ����ü; HashSet�� �̿��Ѵ�.(������) HashSet�� Set�� �ڽ�
		set.add("one");
		set.add("two");
		set.add("3rd");
		set.add(new Integer(4));
		set.add(new Float(5.0F));
		set.add("two");
		set.add(new Integer(4));
		System.out.println(set); // ��� ������� set�� Ư¡�� �˾ƾ� �� 
	}  
}
