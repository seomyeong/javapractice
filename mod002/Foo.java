package jv200.mod002;

import java.lang.*;

public class Foo {
	//�Ӽ�
	private int x;
	private float y = 1000.0f;
	private String name = "Korea";
	
	
	//������ (��ü ������ ���� / �ݵ�� �������� �̸��� Ŭ������� ���ƾ� �Ѵ�. and return Ÿ�� ��ü�� ����.)	
	public Foo() { 
		System.out.println("������:Constructor");
	}
	
	//�޼ҵ� ( �Ӽ�, ������, �޼ҵ��� ������ �ٲ� �� �ִ�. )
	public void sayHello() { 
		int x = 100; // �������� (local variable)
		System.out.println("Hello.");
	}
	public int add(int x, int y) { 
		int result = x + y;
		return result;
	}
}

//Ŭ���� �ٷ� �ؿ��� ����Ǿ� �ִ� �͵�(������ ����)�� ��� ��� �θ���. (��Ȯ�� ���� no, ���� ���� ���� ��)
//�׷��� ��� �Ӽ�, ��� �޼ҵ尡 �ִµ� �޼ҵ带 ��� �޼ҵ�� �θ����� �ʱ� ������ �Ӽ��� ��� variable �̶�� �����ϸ� �ȴ�.
// ���: ������ �ڹ� ��ü�� ������ �ִ� �Ӽ��� �޼ҵ�(��Ȯ�� ����)
//1898 1967 1981
