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
		
		//EnhancedFor �� 
		for(Integer integer : list) { // �캯�� ��ü�� ��� ��ü, �º��� ���߿� �ϳ� Ƣ��� ��
			System.out.println(integer.intValue());
		}
		//��� 80~90%�� �̰��� ������ ����ȭ�� �ؾ��ϴ� ���� Ư�� ��쿡�� IteratorTest2 �������� ��� �Ѵ�.
		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i).intValue());
//		}
	}
}
