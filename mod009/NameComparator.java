package jv200.mod009;

import java.util.Comparator;

// ��ġ StringŬ���� ó�� �ܺο��� ������ �ڵ�� ���� ������ ���� ���� �� ���Ϸ��� Comparator�� ��� �ϴµ� �� ���� ������ ����� Ŭ������ �������Ѵ�.
public class NameComparator implements Comparator<Student>{

	//���⼭�� Student Ŭ������ String Ŭ���� ó�� ���� �Ұ����� �ܺο��� ������ Ŭ������� ����.
	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}


}
