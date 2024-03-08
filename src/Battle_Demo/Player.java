package Battle_Demo;

public class Player {

	private int hp;
	private String name;
	
	public Player(String name) {
		
		hp = 100;
		this.name = name;
	}
	
	public int getHP() { return hp; }
	public void setHP(int hp) { this.hp = hp; }
	
	public int attack() {
		return (int)(Math.random()*10);
	}
	
	public void doThis() {
		attack();
	}
	
	
	
	
}
