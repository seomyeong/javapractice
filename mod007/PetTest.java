package jv200.mod007;

public class PetTest {

	public static void main(String[] args) {
		Pet d = new Dog("말티즈",true); //타입을 pet으로 바꿔도 상관없다. 다형성에 의해
		Pet c = new Cat("샴",false);
		
//		Cat d = new Dog("말티즈",true); //Dog d에 값을 넣으려면 setter, getter이용하거나 생성자 이용
//		Dog c = new Cat("샴",false);		
		
		System.out.println(d.displayInfo());
		System.out.println(c.displayInfo());
		System.out.println("------------------------");
	
		d.cry();
		c.cry();
	}

}
