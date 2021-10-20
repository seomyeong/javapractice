package jv200.mod002;

public class Dog {
//	public int weight;
//	public void setWeight(int w) { //void : return값이 없으므로 void사용
//		if(w>0) {
//			weight = w;		//w값이 0보다 크면 weight에 w값을 대입
//		}
//	}
//	public int getWeight() {
//		return weight;
//	}
	
	//개의 몸무게를 받을 변수
	public int weight;
	// 메소드 getWeight()는 weight값을 반환하는 메소드.
	public int getWeight() {
		return weight;
	}
	//메소드 setWeight는 int w값을 변수 weight에 대입함
	public void setWeight(int w) {
		this.weight=w;
	}
	
}
