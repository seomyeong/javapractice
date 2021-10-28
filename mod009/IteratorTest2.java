package jv200.mod009;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//���׸��� ���� iterator
public class IteratorTest2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		
		//���� ���� ���� ��
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
//			Integer integer = it.next(); // Integer �� Ŭ����. �� ���۷���Ÿ�� 
			int value = it.next(); // int�� primitive Ÿ��. �̰� ��� �����ϳ�. ���� �� �ڹٰ� �˾Ƽ� ���ش�. �̰� auto boxing(����-> ����) / auto unboxing(����->����) ��� �Ѵ�. 
//			System.out.println(integer.intValue());
			System.out.println(value);
		}
		
	}
}
