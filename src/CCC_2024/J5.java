package CCC_2024;


import java.util.Arrays;
import java.util.Scanner;

public class J5 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int rows = 6;
		int cols = 6;
		rows = s.nextInt();
		cols = s.nextInt();
		
		String[][] grid = new String[rows][cols];
		
		for (int i = 0; i < rows; i = i + 1) {
			String line = s.next();
			grid[i] = line.split("");
		}
		
		
		int posr = s.nextInt();
		int posc = s.nextInt();
		
		
		System.out.println(findTotal(grid,posr,posc, rows, cols));
	
		
		
		//for testing
		//for(int r = 0; r < grid.length; r = r + 1) {
		//	System.out.println(Arrays.toString(grid[r]));
		//}
	}
	
	
	public static int findTotal(String[][] grid, int r, int c, int rows, int cols) {
	
		int value = 1; //assume small
		
		if (grid[r][c].equals("M") ) {
			value = 5;
		}
		else if (grid[r][c].equals("L")) {
			value = 10;
		}
		grid[r][c] = "*";
		
		//NORTH
		if (r - 1 > -1 && grid[r - 1][c].equals("*") == false) {
			value =  value + findTotal(grid,r - 1,c, rows, cols);
		}
		//EAST
		if (c + 1 < cols && grid[r][c + 1].equals("*") == false) {
			value = value + findTotal(grid,r,c + 1, rows, cols);
		}
		//SOUTH
		if (r + 1 < rows && grid[r + 1][c].equals("*") == false) {
			value = value + findTotal(grid,r + 1,c, rows, cols);
		}
		//WEST
		if (c - 1 > -1  && grid[r][c - 1].equals("*") == false) {
			value =  value + findTotal(grid,r,c - 1, rows, cols);
		}
		
		return value;
	}

}
