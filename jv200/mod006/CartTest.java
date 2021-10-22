package jv200.mod006;

public class CartTest {

	public static void main(String[] args) {
		Cart myCart = new Cart();
		
		SmartPhone phone = new SmartPhone();
		phone.setName("갤럭시노트20");
		phone.setPrice(1200.0);
		phone.setOs("안드로이드");
		myCart.addProduct(phone);
		
		Notebook notebook = new Notebook();
		notebook.setName("맥북에어");
		notebook.setPrice(200.0);
		notebook.setInch(14.9);
		myCart.addProduct(notebook);
		
		//내가 담은 목록
		myCart.displayProductInfo();
	}

}
