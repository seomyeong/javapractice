package jv200.mod009;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		List list = new ArrayList();  // list �� �������̽��� ��ü�� ���� �� ����. �׷��� list�� ����ü; Hashlist�� �̿��Ѵ�.(������) Hashlist�� list�� �ڽ�
		list.add("one");
		list.add("two");
		list.add("3rd");
		list.add(new Integer(4));
		list.add(new Float(5.0F));
		list.add("two");
		list.add(new Integer(4));
		System.out.println(list); 
//		���׸��� ���� �غ� ��. 
	}  
}
