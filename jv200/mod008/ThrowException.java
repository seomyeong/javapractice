package jv200.mod008;

/**
 * ��� �޼���(���θ޼��� ����)�� throws MyException�� �����ٸ� �����Ͽ����� ���������� �����Ű�� ������ �߰Եǹ���. 
 * try-catch�� ��𿡼� ó���� �������� ���� ������ ������������ ���� �ܰ迡���� ��� ���x
 * 1. throws MyException�� ��� ���Ľ�ų �� �ִ�.
 * 2. ��򰡿��� try-catch�� �������ν� ����ó���� �� �� �ִ�.
 * @author Administrator
 *
 */
public class ThrowException {
	public static void main(String[] args) throws MyException {
		ThrowException te = new ThrowException();
		te.aMethod();
	}
	public void aMethod() throws MyException {
		bMethod();
	}
	public void bMethod() throws MyException { //cMethod()�� throws MyException�̶�� ���ܸ� �߻���ų �� �ִٰ� �ۼ��Ǿ��ֱ� ������ try-catch������ ����ó�� �ϴ��� MyException�� RuntimeException�� ��ӹް� �ϱ�
		cMethod();
	}
	public void cMethod() throws MyException { //��������� ���� �߻�
		System.out.println("c");
	}
}
