package jv200.mod002;

public class Dog {
	public int weight;
	public void setWeight(int w) { //void : return값이 없으므로 void사용
		if(w>0) {
			weight = w;			
		}
	}
	public int getWeight() {
		return weight;
	}
	
}
