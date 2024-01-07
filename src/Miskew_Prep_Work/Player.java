package Miskew_Prep_Work;

public class Player {
	private int x = 0;
	private int y = 0;
	
	public Player(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void incrementX() {
		x = x + 10;
	}
	
	public void decrementX() {
		x = x - 10;
	}
	
	public void incrementY() {
		y = y - 10;
	}
	
	public void decrementY() {
		y = y + 10;
	}
	
	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
