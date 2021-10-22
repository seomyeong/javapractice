package jv200.mod002;

public class DogTest {

	public static void main(String[] args) {
		Dog d = new Dog(); // 객체 생성
		d.setWeight(15); // 몸무게를 할당
		int w = d.getWeight(); // 몸무게를 가져오는 것.
		System.out.println("몸무게 = " + w);
		System.out.println("몸무게 = " + d.weight);
		// d.weight는 Dog 클래스에 선언되어 있는데 private로 선언하면 에러나고 public으로 선언하면 에러가 나지 않는다. 접근제한자(private, public)는 접근 가능여부를 나타낸다.
		
	}

}
