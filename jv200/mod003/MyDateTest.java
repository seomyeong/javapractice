package jv200.mod003;

public class MyDateTest {

	public static void main(String[] args) {
//		MyDate d = new MyDate();
//		위에 에러가 남. 이것은 argument를 받지 않는 생성자가 없다. 
//		즉, 에러가 나지 않으려면 argument를 생성자 대로 넣어주거나 혹은 argument가 없는 생성자를 하나 더 만든다.
//		여기서 알 수 있는 것은 생성자가 1개가 아닐 수 있다는 것.
		
//		MyDate d = new MyDate(26, 10, 2000);
//		MyDate t = new MyDate(3, 7, 1999);
		 
//		t = d; // 3, 7, 1999 값은 메모리 상에 남아있지만 가리키는 것이 없다. 그래서 참조하는것이 없어서 garbage collector가 언젠가 가져간다.
//		26, 10, 2000 / 3, 7, 1999 객체는 두개가 생성되는데 t =d 는 t 객체에 d 값을 대입하는게 아니라 포인터처럼 d 객체에 접근하는 그 주소값이 t에 있게됨.  
		
//		System.out.println(d.getDetails());


		MyDate d = new MyDate(26,10,2000);
		MyDate d2 = d.addDays(3);
		
		System.out.println(d2.getDetails());
		System.out.println(d2.toString());

	}

}
