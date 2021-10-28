package jv200.mod009;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		
		//���� ���� ���� ��
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Integer integer = (Integer)it.next(); // it.next() �� object �� ���Ϲ޴´�. �׷��� casting
			System.out.println(integer.intValue());
		}
		
		
	}
	
	
}
