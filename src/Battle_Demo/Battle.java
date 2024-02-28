package Battle_Demo;

public class Battle {

	
	public static void main(String[] args) {
		System.out.println("BATTLE BEGIN");
		Wizard w1 = new Wizard("Paul");
		Monster m1 = new Monster(50,"Gibdo");
		
		int turn = 0;
		
		while (m1.getHP() > 0 && w1.getHP() > 0) {
			
			//player turn
			if (turn%2 == 0) {
				int damage = w1.startAttack();
				System.out.println("Wizard Attak: "+damage);
				m1.setHP(m1.getHP() - damage);
			}//monster turn
			else {
				int damage = m1.startAttack();
				System.out.println("Monster Attack: "+damage);
				w1.setHP(w1.getHP()- damage);
				
			}
			System.out.println(" Wizard: "+Math.max(w1.getHP(),0));
			System.out.println("Monster: "+Math.max(m1.getHP(), 0));
			System.out.println("*******************");
			turn = turn + 1;
			
		}
		
		if (w1.getHP() > 0) {
			System.out.println("WIZARD WINS!!");
		}
		else {
			System.out.println("MONSTER WINS!!!");
		}
		System.out.println("BATTLE DONE");
		
	}
}
