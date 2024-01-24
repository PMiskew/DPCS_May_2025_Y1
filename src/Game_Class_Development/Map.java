package Game_Class_Development;

public class Map {

	private int row;
	private int col;
	
	private int[][] map;
	
	public Map(int r, int c) {
		row = r;
		col = c;
		
		map = new int[row][col]; //we need to construct the array structure before we can do anythign with it. 
	}
	
	
	
}
