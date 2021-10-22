package jv200.mod006;

public class Cart {
//	String name;
//	double price;
//	int i=0;
	
	
	
	Product[] products = new Product[2];
	/**
	 * 전달된 Product를 products 배열에 저장
	 * @param p
	 */
	public void addProduct(Product p) {
		for(int i=0; i<products.length; i++) {
			if(products[i]==null)
				products[i]=p;
				break;
		}
	}
	
	/**
	 * 상품정보가 담긴 products를 리턴
	 * @return
	 */
	public Product[] getProducts() {
		return products;
	}
	
	/**
	 * cart(products 배열)에 담긴 products를 출력
	 */
	public void displayProductInfo() {
		for(int i=0; i<products.length; i++) {
			if(products[i] != null) { //null을 써주지 않으면 nullPointException ?
				System.out.println("\n상품명 : "+products[i].getName());
				System.out.println("상품가격 : "+products[i].getPrice());
				if(products[i] instanceof SmartPhone) {
					SmartPhone sp = (SmartPhone)products[i];
					System.out.println("OS :"+sp.getOs());
				}else {
					Notebook nb = (Notebook)products[i];
					System.out.println("Inch : "+nb.getInch());
				}
			}
		}

	}
	
}
