package Battle_Demo;

public class Monster {

	private int hp;
	private String name;
	
	public Monster(int hp, String name) {
		this.hp = hp;
		this.name = name;
		
	}
	
	public int getHP() { return hp; }
	public String getName() { return name; }
	
	public void setHP(int hp) { this.hp = hp; }
	public void setName (String name) { this.name = name; }
	
	/*
	 * I named this start attack so that it is consistent with 
	 */
	public int startAttack( ) {
		return (int)(Math.random()*10);
	}
}
