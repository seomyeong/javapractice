package jv200.mod006;

public class CartTest {

	public static void main(String[] args) {
		Cart myCart = new Cart();
		
		SmartPhone phone = new SmartPhone();
		phone.setName("�����ó�Ʈ20");
		phone.setPrice(1200.0);
		phone.setOs("�ȵ���̵�");
		myCart.addProduct(phone);
		
		Notebook notebook = new Notebook();
		notebook.setName("�ƺϿ���");
		notebook.setPrice(200.0);
		notebook.setInch(14.9);
		myCart.addProduct(notebook);
		
		//���� ���� ���
		myCart.displayProductInfo();
	}

}
