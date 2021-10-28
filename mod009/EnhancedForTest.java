package jv200.mod009;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EnhancedForTest {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		
		//EnhancedFor 문 
		for(Integer integer : list) { // 우변은 객체를 담는 객체, 좌변은 그중에 하나 튀어나온 것
			System.out.println(integer.intValue());
		}
		//대게 80~90%는 이것을 쓰지만 동기화를 해야하는 등의 특정 경우에는 IteratorTest2 형식으로 써야 한다.
		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i).intValue());
//		}
	}
}
