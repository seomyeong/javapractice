package jv200.mod009;

import java.util.Set;
import java.util.TreeSet;

public class MyComparable implements Comparable<MyComparable>{
	String name;
	public MyComparable(String name){
		this.name = name;
	}
	@Override
	public int compareTo(MyComparable o) { // ���� ����� ���� ������
		int diff = this.name.compareTo(o.name);
		if(diff < 0) {
			return 1;
		}else if(diff == 0) {
			return 0;
		}else{
			return -1;
		}
				
	}
	public static void main(String[] args) {
		MyComparable s = new MyComparable("����");
		MyComparable s2 = new MyComparable("����");
		MyComparable s3 = new MyComparable("���");
		
		Set<MyComparable> nameSet = new TreeSet<MyComparable>();
		nameSet.add(s);
		nameSet.add(s2);
		nameSet.add(s3);
		
		System.out.println("[�̸����� ���]");
		for(MyComparable n : nameSet) {
			System.out.println(n.name);
		}
	}

}
