package jv200.mod009;

import java.util.Comparator;

// 마치 String클래스 처럼 외부에서 가져온 코드라서 내가 수정할 수가 없을 때 비교하려면 Comparator를 써야 하는데 이 때는 기준을 만드는 클래스를 만들어야한다.
public class NameComparator implements Comparator<Student>{

	//여기서는 Student 클래스가 String 클래스 처럼 수정 불가능한 외부에서 가져온 클래스라고 가정.
	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}


}
