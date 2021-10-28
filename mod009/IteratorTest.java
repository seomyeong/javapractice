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
		
		//넣은 값을 빼올 때
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Integer integer = (Integer)it.next(); // it.next() 는 object 를 리턴받는다. 그래서 casting
			System.out.println(integer.intValue());
		}
		
		
	}
	
	
}
