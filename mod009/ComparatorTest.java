package jv200.mod009;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorTest {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("유비", 93.4));
		list.add(new Student("관우", 88.5));
		list.add(new Student("장비", 64.8));
		list.add(new Student("공명", 98.4));
		list.add(new Student("조조", 98.4));
		
		Comparator<Student> nameComp = new NameComparator();
		Collections.sort(list, nameComp); //비교대상, 비교기준
		for(Student s : list) {
			System.out.println(s.name);
		}
		
		System.out.println("-------------------------------------");
		Comparator<Student> gradeComp = new GradeComparator();
		Collections.sort(list, gradeComp);
		for(Student s : list) {
			System.out.println(s.name);
		}
	}
}
