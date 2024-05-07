package Miskew_Prep_Work;

public class DarkKnight extends Enemy {

	private int darkEnergy = 100;
	
	public DarkKnight() {
		
		setSize(3);
	}
	
	public DarkKnight(Enemy e) {
		
		//copy all enemy attributes
		//set new DK atttributes
	}
	public void attackOverload() {
		System.out.println("OVERLOADING");
	}
}
