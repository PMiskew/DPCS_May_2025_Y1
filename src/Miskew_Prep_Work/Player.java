package Miskew_Prep_Work;

public class Player {

	private final static int STEP = 10;
	
	private int xpos;
	private int ypos;
	
	private int strenght = 10;
	private int wisdom = 10;
	private int charisma = 10;
	private int dexterity = 10;
	
	private String name = "Paul";
	private String role = "Bard"; //note this represet the characters class in DnD but I cannot use the word class since it is a reserved word. 
	
	
	private int wood = 0;
	
	public Player() {
	
		xpos = 10;
		ypos = 10;
		
	}
	
	//Get and set methods
	//Take note that in some cases the parameter has the same
	//name as the field.  In this case WE MUST use this. notation
	//to indicate field.  Also, notice that STEP is a static constant
	//which means we don't have a set method and the get method is
	//static.  Static fields and methods are shared with all instances.
	//Static methods do not have access ot instance variables since no
	//instance is needed to call it. 
	public void setX(int x) { xpos = x; }
	public void setY(int y) { ypos = y; }
	public int getX() { return xpos; }
	public int getY() { return ypos; }
	public int getStrenght() { return strenght; }
	public void setStrenght(int strenght) { this.strenght = strenght; }
	public int getWisdom() { return wisdom; }
	public void setWisdom(int wisdom) { this.wisdom = wisdom; }
	public int getCharisma() { return charisma; }
	public void setCharisma(int charisma) { this.charisma = charisma; }
	public int getDexterity() { return dexterity; }
	public void setDexterity(int dexterity) { this.dexterity = dexterity; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public String getRole() { return role; }
	public void setRole(String role) {	this.role = role; }
	public int getWood() { return wood;}
	public void setWood(int wood) { this.wood = wood; }
	
}
