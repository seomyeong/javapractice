package jv200.mod002;

public class DogTest {

	public static void main(String[] args) {
		Dog d = new Dog(); // ��ü ����
		d.setWeight(15); // �����Ը� �Ҵ�
		int w = d.getWeight(); // �����Ը� �������� ��.
		System.out.println("������ = " + w);
		System.out.println("������ = " + d.weight);
		// d.weight�� Dog Ŭ������ ����Ǿ� �ִµ� private�� �����ϸ� �������� public���� �����ϸ� ������ ���� �ʴ´�. ����������(private, public)�� ���� ���ɿ��θ� ��Ÿ����.
		
	}

}
