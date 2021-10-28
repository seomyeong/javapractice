package jv200.mod002;

public class Dog {
	public int weight; 
	
	public void setWeight(int w){
		if(w > 0) {
			weight = w; 
		} 
	}
	
	public int getWeight() { 
		return weight;
	}
}
