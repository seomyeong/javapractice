package jv200.mod008;

//java AddArguments 1 2 3 4
//run configuration -> ����Ŭ������ �ش� Ŭ������ ���� �� arguments�ǿ� 1 2 3 4 �� �Է��ϸ� �״�� �޾ƿ��� ��
public class AddArguments2 {
	public static void main(String[] args) {
			int sum = 0;
			
			try {
			for(int i=0; i<args.length; i++) {
				String arg = args[i];
			}
			for(String arg : args) { //args���� arg�ϳ��� �޾ƿ°Ͱ� �Ȱ���. �ڷ��������� : �迭�� or �ڷ��� �� �ܰ� �Ʒ��� �ڷ����� ������ : �迭��
				sum=sum+Integer.parseInt(arg);
			}
			System.out.println("sum = "+sum);
		}catch(NumberFormatException e) { //�߻��� ������ ����
			System.out.println("���޹��� �ƱԸ�Ʈ �� �ϳ��� ���ڰ� �ƴմϴ�.");
		}finally {
			System.out.println("���ܹ߻� ������ ������� ��µ˴ϴ�.");
		}
	}
}
