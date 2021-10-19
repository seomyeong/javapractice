package jv200.mod003;

public class IntWhileTest {

	public static void main(String[] args) {
		int num = 'A'+1;
		System.out.println(num);

		while(num > 1) {
//			System.out.println(num); //무한루프
		}
		
		do {
			System.out.println("일단 이건 찍혀");
		}while(num>1);
		
	}

}
