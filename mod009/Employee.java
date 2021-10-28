package jv200.mod009;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *  "����", 50000.0
 *  "����", 42000.0
 *  "���", 38000.0
 *  "����", 45000.0
 *  "����", 45000.0
 *  salary ������� �������� ���� 
 * 
 * @author Administrator
 *
 */

public class Employee implements Comparable<Employee>{
	String name;
	double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	
	}
	@Override
	public int compareTo(Employee o) {
		
		if(this.salary > o.salary) {
			return -1; 
		}else if(this.salary == o.salary) {
			return 0;
		}else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee("����", 50000.0); 
		Employee e2 = new Employee("����", 42000.0);
		Employee e3 = new Employee("���", 38000.0);
		Employee e4 = new Employee("����", 45000.0);
		Employee e5 = new Employee("����", 45000.0);
		
		Set<Employee> set = new TreeSet<Employee>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		
		System.out.println("�� : " + set.size() + "��");
		for(Employee e : set) {
			System.out.println(e.name + " : "+ e.salary );
		}
		System.out.println("---------------------------------------");
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		Collections.sort(list); // Sort�� ���� ������ �츮�� ���ϰ�(implements Comparable �� ���ؼ�). �� ���ش�� �����ض� ��� �� �� �̷��� �Ѵ�. Sort
		
		System.out.println("�� : " + list.size() + "��");
		for(Employee e : list) {
			System.out.println(e.name + " : "+ e.salary );
		
		}

	}
	 

}
