package jv200.mod003;

public class Assign {

	public static void main(String[] args) {
		//���� Ÿ�� ����
		int x;
		int y;
		
		//floating
		float z = 3.14f;
		//double
		double w = 3.14;
		//boolean
		boolean truth = true;
		//char 
		char c = 'A';
		String str = "A";

		z = -1;
		byte b = 10;
		x = b; // ����. ���� �������� byte���� int�� ���� ���� �����ϴ�. �ݴ�� �ȵ�.
//		b = x; ������ ū����� ���� ����� ��°Ŵϱ�. ������ �Ʒ�ó�� �ϸ� ���� �� �ִ�. 
		b = (byte) x; // casting  ; �����ϴٴ°��� ������ �ǰ� ���� �ȴٴ� ��. ������ byte�� �� �� ���� ũ���� ���ڸ� ������ �����Ͱ� ������.
		
	}

}
