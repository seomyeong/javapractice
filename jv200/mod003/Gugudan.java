package jv200.mod003;

public class Gugudan {

	public static void main(String[] args) {
		GugudanObj g = new GugudanObj();
		for(int i=1; i<=9; i++) {
			System.out.println();
			for(int j=1; j<=9; j++) {
				g.GugudanTest(j, i);
				g.getGugudan();
			}
		}
	}

}
