package jv200.mod006;

public class Cart {
//	String name;
//	double price;
//	int i=0;
	
	
	
	Product[] products = new Product[2];
	/**
	 * ���޵� Product�� products �迭�� ����
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
	 * ��ǰ������ ��� products�� ����
	 * @return
	 */
	public Product[] getProducts() {
		return products;
	}
	
	/**
	 * cart(products �迭)�� ��� products�� ���
	 */
	public void displayProductInfo() {
		for(int i=0; i<products.length; i++) {
			if(products[i] != null) { //null�� ������ ������ nullPointException ?
				System.out.println("\n��ǰ�� : "+products[i].getName());
				System.out.println("��ǰ���� : "+products[i].getPrice());
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
