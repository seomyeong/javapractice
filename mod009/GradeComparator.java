package jv200.mod009;

import java.util.Comparator;

public class GradeComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		double diff = o1.gradePointAve - o2.gradePointAve;
		if(diff>0) {
			return -1;
		}else if(diff == 0) {
			return 0;
		}else {
			return 1;
		}
	}
}
