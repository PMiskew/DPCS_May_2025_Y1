package Game_Class_Development;

import java.util.Scanner;

import java.io.File;

public class Map {

	
	
	private static final double LAND_PROB = 0.80;
	private static final double WATER_PROB = .10;
	private static final double FOREST_PROB = 1 - LAND_PROB - WATER_PROB;
	
	private int row;
	private int col;
	
	private String name;
	private int[][] map;
	
	public Map(int r, int c) {
		name = "none";
		row = r;
		col = c;
		
		map = new int[row][col]; //we need to construct the array structure before we can do anythign with it. 
		generateMap();
		//printMap();
	}
	
	public Map(String file, String n) {
		
		try {
			Scanner fileReader = new Scanner(new File(file));
			
			row = Integer.parseInt(fileReader.nextLine());
			col = Integer.parseInt(fileReader.nextLine());

			map = new int[row][col]; //I kept forgetting this
			//Interesting: modify loop structure to manage file. 
			//Concern: Numbering system is going to get cumbersome. 
			int r = 0;
			
			
			while (fileReader.hasNext()) {
			
				String line = fileReader.nextLine();
				System.out.println(line);
				
				for (int c = 0; c < col; c = c + 1) {
						
					map[r][c] = (Integer.parseInt(line.substring(c,c+1)));
				
				}
				
				r = r + 1;
		
			}
			
			System.out.println("TOWN CREATED");
		}
		catch(Exception e) {
			System.out.println("NO TOWN");
		}
	
	}
	public Map(int r, int c, String n) {
		
		name = n;
		
		row = r;
		col = c;
		
		map = new int[row][col]; //we need to construct the array structure before we can do anythign with it. 
		generateMap();
		//printMap();
	
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
	
	public void setValue(int r, int c, int v) { map[r][c] = v;}
	
	public int[][] getMap() { return map; }
	
	public static double get_LAND_PROB() { return LAND_PROB; }
	
	public static void main(String[] args) {
		Map m = new Map(10,10);
	}
	
	
}
