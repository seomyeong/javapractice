package jv200.mod007;

public class PetTest {

	public static void main(String[] args) {
		Pet d = new Dog("��Ƽ��",true); //Ÿ���� pet���� �ٲ㵵 �������. �������� ����
		Pet c = new Cat("��",false);
		
//		Cat d = new Dog("��Ƽ��",true); //Dog d�� ���� �������� setter, getter�̿��ϰų� ������ �̿�
//		Dog c = new Cat("��",false);		
		
		System.out.println(d.displayInfo());
		System.out.println(c.displayInfo());
		System.out.println("------------------------");
	
		d.cry();
		c.cry();
	}

}
