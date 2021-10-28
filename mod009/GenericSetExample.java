package jv200.mod009;

import java.util.HashSet;
import java.util.Set;

public class GenericSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>(); // String타입으로 지정한것 
		set.add("one");
		set.add("two");
		set.add("3rd"); 
//		set.add(new Integer(4)); 타입이 달라서 여기서는 컴파일 에러가 난다. 
	}
	//Q. 제네릭스로 String을 지정한 후에 만약 이외에 다른 타입을 입력 받고 싶을 경우에는 어떻게 해야하나요?
	//Q. 혹은 여러 타입을 입력받고 싶을때 제네릭스는 어떻게 할 수 있나요? 
}
