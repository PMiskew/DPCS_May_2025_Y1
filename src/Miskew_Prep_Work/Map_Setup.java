package Miskew_Prep_Work;

import java.util.Arrays;

public class Map_Setup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a = generate1DArray(10, 0.7);
		//System.out.println(Arrays.toString(a));
		
		int[][] b = randomWalkAlgorithm();
		
		for (int r = 0; r < b.length; r = r + 1) {
			System.out.println(Arrays.toString(b[r]));
		}
	}
	
	public static int getInt(int seed, double repeat) {
		
		double rand = Math.random();
		int result = -1;
		
		if (rand < repeat) {
			return seed;
		}
		
		do {
			result = (int)(Math.random()*5);
		} while (result == seed);
		
		return result;
	}
	
	/**
	 * Build from tutorial:
	 * https://www.freecodecamp.org/news/how-to-make-your-own-procedural-dungeon-map-generator-using-the-random-walk-algorithm-e0085c8aa9a/
	 * 
	 * @return
	 */
	public static int[][] randomWalkAlgorithm() {
		
		
		int dimensions = 10;
		int maxTunnel = 3;
		int maxLength = 3;
		int[][] directions = {{-1,0},{1,0},{0,1},{0,1}};
		
		int[] randomDirection = {0,0};
		int[] lastDirection = {0,0};
		
		int randomLength = 0;
		int tunnelLength = 0;
		
		int[][] a = new int[dimensions][dimensions];
		
		for (int r = 0; r < dimensions; r = r + 1) {
			for (int c = 0; c < dimensions; c = c + 1) {
				a[r][c] = 1;
			}
		}
		
		int currentRow = (int)(Math.floor(Math.random()*dimensions));

		int currentColumn = (int)(Math.floor(Math.random()*dimensions));
		
		do {         
			randomDirection = directions[(int)(Math.floor(Math.random()* directions.length))];      
		} while ((randomDirection[0] == -lastDirection[0] && randomDirection[1] == -lastDirection[1]) || (randomDirection[0] == lastDirection[0] &&  randomDirection[1] == lastDirection[1]));
		
		randomLength = (int)(Math.ceil(Math.random() * maxLength));      
				
		while (tunnelLength < randomLength) { 
			 if ( ( (currentRow == 0) && (randomDirection[0] == -1) )|| ( (currentColumn == 0) && (randomDirection[1] == -1) ) || ( (currentRow == dimensions - 1) && (randomDirection[0] == 1) ) || ( (currentColumn == dimensions - 1) && (randomDirection[1] == 1) ) ) { 
				 break; 
			 } //end if
			 else{ 
				  a[currentRow][currentColumn] = 0; 
				  currentRow += randomDirection[0];
				  currentColumn += randomDirection[1]; 
				  tunnelLength++; 
			} 
			
		} //end while
		
		if (tunnelLength < maxTunnel) { 
			 lastDirection = randomDirection; 
			 maxTunnel--; 
		}
		return a;

		
	}
	public static int[][] generate2DArrayB(int rows, int cols, double repeat) {
		
		int[][] a = new int[rows][cols];
		
		//Build top row using single array approach
		a[0] = generate1DArray(cols,repeat);
		
		//build remaining row using 
		for (int r = 1; r < rows; r = r + 1) {
			
			int top = a[r - 1][0];
			a[r][0] = getInt(top,0.8);
			 
			for (int c =1; c < cols; c = c + 1) {
				
				int w = a[r][c - 1];
				int nw = a[r - 1][c - 1];
				int n = a[r - 1][c];
				
				
				//if all four are the same the cell matches
				if (w == nw && w == n) {
					a[r][c] = a[r][c - 1];
				}
				else {
					
					a[r][c] = getInt(w,0.8);
				}
				
			}
			
			
		}
		
		return a;
	}
	public static int[][] generate2DArrayA(int rows, int cols, double repeat) {
		
		int[][] a = new int[rows][cols];
		
		for (int r = 0; r < rows; r = r + 1) {
			
			a[r][0] = (int)(Math.random()*5);
			
			for (int c = 1; c < cols; c = c + 1) {
				
				double rand = Math.random();
				
				if (rand < repeat) {
					
					a[r][c] = a[r][c - 1];
					
				}
				else {
					
					int e = -1;
					
					do {
						
						e = (int)(Math.random()*5);
						
					}while (e == a[r][c - 1]);
					
					a[r][c] = e;
					
				}
			}
		}
		return a;
	}
	
	public static int[] generate1DArray(int l, double repeat) {
		
		int[] a = new int[l];
		a[0] = (int)(Math.random()*5);
		
		for (int i = 1; i < a.length; i = i + 1) {
			
			double r = Math.random();
			
			if (r < repeat) {
			
				a[i] = a[i - 1];
				
			}
			else {
				
				int e = -1;
				
				do {
					
					e = (int)(Math.random()*5);
					
				}while (e == a[i - 1]);
				
				a[i] = e;
				
			}
		}
		return a;
	}

}
