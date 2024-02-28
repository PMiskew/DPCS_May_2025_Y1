package Battle_Demo;

public class Wizard extends Player{

	
	int mana = 100;
	
	public Wizard(String name) {
		super(name);
	}
	
	public int startAttack() {
		
		if (mana > 0) {
			mana = mana - 10;
			return attack();
		}
		else {
			return super.attack();
		}
	}
	
	public int attack() {
		return (int)(Math.random()*20);
	}
		
}
