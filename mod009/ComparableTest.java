package jv200.mod009;

import java.util.Set;
import java.util.TreeSet;

public class ComparableTest {
	public static void main(String[] args) {
		String name = "����";
		String name2 = "����";
		String name3 = "���";
		
		System.out.println("���� vs ���� : " + (name.compareTo(name2) > 0 ? true : false)); // compaerTo. 0���� ū �� or 0, 0���� ���� �� �� ����. 0���� ū ��: ������ name�� name2���� ũ�ٴ� ��.
		System.out.println("���� vs ��� : " + (name2.compareTo(name3) > 0 ? true : false));
		Set<String> nameSet = new TreeSet<String>(); // ������ �� �� TreeSet�� ���µ� ��� ���������� ���ؼ��� �������� �ʴ´�.
		nameSet.add(name);
		nameSet.add(name2);
		nameSet.add(name3);
		
		System.out.println("[�̸��� ���]");
		for(String n : nameSet) { 
			System.out.println(n);
		}
	}

} 
