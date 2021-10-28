package jv200.mod009;

import java.util.Set;
import java.util.TreeSet;

public class ComparableTest {
	public static void main(String[] args) {
		String name = "유비";
		String name2 = "관우";
		String name3 = "장비";
		
		System.out.println("유비 vs 관우 : " + (name.compareTo(name2) > 0 ? true : false)); // compaerTo. 0보다 큰 수 or 0, 0보다 작은 수 로 나옴. 0보다 큰 수: 나오면 name이 name2보다 크다는 것.
		System.out.println("관우 vs 장비 : " + (name2.compareTo(name3) > 0 ? true : false));
		Set<String> nameSet = new TreeSet<String>(); // 정렬을 할 때 TreeSet을 쓰는데 어떻게 정렬할지에 대해서는 관여하지 않는다.
		nameSet.add(name);
		nameSet.add(name2);
		nameSet.add(name3);
		
		System.out.println("[이름순 출력]");
		for(String n : nameSet) { 
			System.out.println(n);
		}
	}

} 
