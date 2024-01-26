package Miskew_Prep_Work;

public class Map {

	private static final double LAND_PROB = 0.60;
	private static final double WATER_PROB = 0.20;
	private static final double FOREST_PROB = 1 - LAND_PROB - WATER_PROB;
	
	private int row;
	private int col;
	
	private int[][] map;
	
	public Map(int r, int c) {
		row = r;
		col = c;
		
		map = new int[row][col]; //we need to construct the array structure before we can do anythign with it. 
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
		map[2][3] = 3;
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
	
	public int[][] getMap() { return map;}
	public static void main(String[] args) {
		Map m = new Map(10,10);
	}
	
	public void setMapValue(int r, int c, int v) {
		map[r][c] = v;
	}
	
	
}
