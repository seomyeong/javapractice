package jv200.mod007;

public abstract class Pet {
	protected String type;
	protected boolean male;
	
	public Pet(String type, boolean male) {
		this.type=type;
		this.male=male;
	}
	
	public abstract void cry();

	public String displayInfo() {
		return "Ç°Á¾ : "+type+"\n¾ÏÄÆ : "+male;
	}
}
