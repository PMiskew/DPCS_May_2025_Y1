package Miskew_Prep_Work;

public class Player {

	private final static int STEP = 10;
	
	private int rpos;
	private int cpos;
	
	private int strenght = 10;
	private int wisdom = 10;
	private int charisma = 10;
	private int dexterity = 10;
	
	private String name = "Paul";
	private String role = "Bard"; //note this represet the characters class in DnD but I cannot use the word class since it is a reserved word. 
	
	public Player() {
	
		rpos = 10;
		cpos = 10;
		
	}
	
	//Get and set methods
	//Take note that in some cases the parameter has the same
	//name as the field.  In this case WE MUST use this. notation
	//to indicate field.  Also, notice that STEP is a static constant
	//which means we don't have a set method and the get method is
	//static.  Static fields and methods are shared with all instances.
	//Static methods do not have access ot instance variables since no
	//instance is needed to call it. 
	public void setR(int r) { rpos = r; }
	public void setC(int c) { cpos = c; }
	public int getR() { return rpos; }
	public int getC() { return cpos; }
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
	
}
