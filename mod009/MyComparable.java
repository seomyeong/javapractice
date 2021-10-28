package jv200.mod009;

import java.util.Set;
import java.util.TreeSet;

public class MyComparable implements Comparable<MyComparable>{
	String name;
	public MyComparable(String name){
		this.name = name;
	}
	@Override
	public int compareTo(MyComparable o) { // 역순 출력을 위한 재정의
		int diff = this.name.compareTo(o.name);
		if(diff < 0) {
			return 1;
		}else if(diff == 0) {
			return 0;
		}else{
			return -1;
		}
				
	}
	public static void main(String[] args) {
		MyComparable s = new MyComparable("유비");
		MyComparable s2 = new MyComparable("관우");
		MyComparable s3 = new MyComparable("장비");
		
		Set<MyComparable> nameSet = new TreeSet<MyComparable>();
		nameSet.add(s);
		nameSet.add(s2);
		nameSet.add(s3);
		
		System.out.println("[이름역순 출력]");
		for(MyComparable n : nameSet) {
			System.out.println(n.name);
		}
	}

}
