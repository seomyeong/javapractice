package jv200.mod009;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>(); // map�� ���׸���. ���ָ� warning �� �����.
		map.put("1", "dog");
		map.put("2", "cat");
		map.put("3", "duck");
		
		System.out.println(map.get("1"));
		// �ٸ� ������� �־��� �� �� ���� �ٸ� ����(�ؽð� ��) ���� ��Ÿ�� ���� �ִ�. �׶� toString ������ ����.
	}
}
