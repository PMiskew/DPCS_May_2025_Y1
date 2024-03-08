package Battle_Demo;

public class Monster {

	private int hp;
	private String name;
	
	public Monster(int hp, String name) {
		//What invisible line is right at the start of the constructor
		super();
		
		setHP(hp);
		setName(name);
		
	}
	
	public int getHP() { return hp; }
	public String getName() { return name; }
	
	public void setHP(int hp) { 
		
		if (hp < 10 || hp > 100) {
			this.hp = 50;
		}
		else {
			this.hp = hp;
		}
		
	}
		
	public void setName (String name) { this.name = name; }
	
	/*
	 * I named this start attack so that it is consistent with 
	 */
	public int startAttack( ) {
		return (int)(Math.random()*10);
	}
}
