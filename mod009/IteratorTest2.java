package jv200.mod009;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//제네릭스 사용시 iterator
public class IteratorTest2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		
		//넣은 값을 빼올 때
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
//			Integer integer = it.next(); // Integer 는 클래스. 즉 레퍼런스타입 
			int value = it.next(); // int는 primitive 타입. 이게 어떻게 가능하냐. 했을 때 자바가 알아서 해준다. 이걸 auto boxing(프리-> 레퍼) / auto unboxing(레퍼->프리) 라고 한다. 
//			System.out.println(integer.intValue());
			System.out.println(value);
		}
		
	}
}
