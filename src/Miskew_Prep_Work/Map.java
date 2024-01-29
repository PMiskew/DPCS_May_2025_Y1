package Miskew_Prep_Work;

/*
 * 
 * Land = 0
 * Water = 1
 * Forest = 2
 * Wall = 3
 * Wood = 4
 * 
 */
public class Map {

	private static final double LAND_PROB = 0.80;
	private static final double WATER_PROB = .10;
	private static final double FOREST_PROB = 1 - LAND_PROB - WATER_PROB;
	
	private int row;
	private int col;
	
	private int[][] map;
	private int[][] cave;
	
	public Map(int r, int c) {
		row = r;
		col = c;
		
		map = new int[row][col]; //we need to construct the array structure before we can do anythign with it. 
		cave = new int[row][col];
		
		createStream();
		generateMap();
		
		printMap();
	}
	
	public void generateMap() {
		
		
		for (int r = 0; r < map.length; r = r + 1) {
			
			for (int c = 0; c < map[r].length; c = c + 1) {
				
				double rand = Math.random();
				
				if (rand < LAND_PROB) {
					map[r][c] = 0;
				}
				else if (rand < LAND_PROB + WATER_PROB) {
					map[r][c] = 1;
				}
				else {
					map[r][c] = 2;
				}
			}
		}
		createForest();
	}
	
	/*This is a test method I have created to print map */
	public void printMap() {
		
		for (int r = 0; r < map.length; r = r + 1) {
			for (int c = 0; c < map[r].length; c = c + 1) {
				System.out.print(map[r][c]+"");
			}
			System.out.println("");
		}
	}
	
	
	public void createForest() {
		

				
		for (int r = 1; r < map.length - 1; r = r + 1) {
			
			for (int c = 1 ; c < map[r].length - 1; c = c + 1) {
				
				double rand = Math.random();
				if (map[r][c] == 2 && rand < 0.20) {
					
					map[r - 1][c - 1] = 2;

					map[r - 1][c] = 2;

					map[r - 1][c + 1] = 2;

					map[r][c - 1] = 2;

					map[r][c] = 2;

					map[r][c + 1] = 2;

					map[r + 1][c - 1] = 2;

					map[r + 1][c] = 2;

					map[r + 1][c + 1] = 2;
					
					
					
					
				}
				
				
				
			}
		}
	}
	
	public void createStream() {
		
		//						NE    SE    SW      NW
		int[][] direction = {{1,-1},{1,1},{-1,1},{-1,-1}};
		
		for (int r = 0; r < map.length; r = r + 1) {
			
			for (int c = 0; c < map[r].length; c = c + 1) {
				
				
				double makeRiver = Math.random(); 
				if (map[r][c] == 1 && makeRiver > 0.9) {
					
					int rand = (int)(Math.random()*4);
					int or = r; //origin or river
					int oc = c; //origin of river
					int[] dir = direction[rand];
					
					while (or > 0 && or < 48 && oc > 0 && oc < 48) {
						
						
						map[or + direction[rand][0]][oc + direction[rand][1]] = 1;
				
						
						or = or + direction[rand][0];
						oc = oc + direction[rand][1];
									
					}
				}
				
				
			}
		}
	}
	
	
	
	public void setValue(int r, int c, int v) { map[r][c] = v;}
	
	public int[][] getMap() { return map; }
	
	
	
	
}
