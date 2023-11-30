package Miskew_Prep_Work;

import java.util.Arrays;

public class Map_Setup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = generate1DArray(10, 0.7);
		System.out.println(Arrays.toString(a));
		
		int[][] b = generate2DArrayB(10,10,0.5);
		
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
