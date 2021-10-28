package jv200.mod009;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		List list = new ArrayList();  // list 은 인터페이스라서 객체를 만들 수 없다. 그래서 list의 구현체; Hashlist을 이용한다.(다형성) Hashlist은 list의 자식
		list.add("one");
		list.add("two");
		list.add("3rd");
		list.add(new Integer(4));
		list.add(new Float(5.0F));
		list.add("two");
		list.add(new Integer(4));
		System.out.println(list); 
//		제네릭스 내가 해볼 것. 
	}  
}
