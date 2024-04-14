package Dwite_Problems;

import java.util.Arrays;

public class Dwite_MineSweeper {

	public static void main(String[] args) {
		
		//Scaffold Inputs
		//	1. Just predefine the variables and figure out hte logic
		//	2. Take inputs from the keyboard (maybe)
		//	3. Read single case from file
		//	4. Read multiple cases from file (the contest says there are 5 examples per file)
		int row = 4; 
		int col = 4;
		
		//We always have a - e
		char[][] data = {{'*','.','a','.'},
						 {'b','.','c','.'},
						 {'.','*','.','.'},
						 {'.','d','.','e'}
						};

		int[] amount = {0,0,0,0,0};
		for (int r = 0; r < row; r = r + 1) {
			
			for (int c = 0; c < col; c = c + 1) {
				
				if (data[r][c] != '*' && data[r][c] != '.') {
					
					amount[data[r][c] - 97] = data[r][c];
				}
			
			}
			
		}
		System.out.println(Arrays.toString(amount));
		
	}
	
}
