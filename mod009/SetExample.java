package jv200.mod009;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set set = new HashSet();  // Set 은 인터페이스라서 객체를 만들 수 없다. 그래서 Set의 구현체; HashSet을 이용한다.(다형성) HashSet은 Set의 자식
		set.add("one");
		set.add("two");
		set.add("3rd");
		set.add(new Integer(4));
		set.add(new Float(5.0F));
		set.add("two");
		set.add(new Integer(4));
		System.out.println(set); // 출력 결과에서 set의 특징을 알아야 함 
	}  
}
