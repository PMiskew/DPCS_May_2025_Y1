package Miskew_Prep_Work;

import java.util.ArrayList;

public class EnemyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Enemy> enemies = new ArrayList<Enemy>();
		
		
		enemies.add(new Enemy());
		enemies.add(new DarkKnight());
		enemies.add(new Enemy());
		
		
		((DarkKnight)enemies.get(1)).attackOverload(); //This works since the second element is a DarkKnight
		
		for (int i = 0; i < enemies.size(); i = i + 1) {
			
			Enemy temp = enemies.get(i);
			
			if (temp instanceof DarkKnight) {
				((DarkKnight)temp).attackOverload();
			}
			else {
				temp.attack();
			}
			
		}
		
	}
	
	public Enemy evolve(Enemy e)  {
		
		DarkKnight temp = new DarkKnight(e);
		return temp;
	}

}
