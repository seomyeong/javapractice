package jv200.mod009;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>(); // map의 제네릭스. 해주면 warning 다 사라짐.
		map.put("1", "dog");
		map.put("2", "cat");
		map.put("3", "duck");
		
		System.out.println(map.get("1"));
		// 다른 밸류들을 넣었을 때 그 값이 다른 형태(해시값 등) 으로 나타날 수도 있다. 그때 toString 재정의 생각.
	}
}
