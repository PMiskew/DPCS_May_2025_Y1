package Miskew_Prep_Work;

public class Array2DNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * DATA = { { 1,  2,  3,  4},
		 * 		 	{ 5,  6,  7,  8},
		 * 			{ 9, 10, 11, 12}
		 * 		  }
		 * 
		 *  Big Ideas:
		 *  
		 *  1. 	You can find the total number of elements in a 2D 
		 *  	array by mulitiplying the rows and the columns together
		 *  	DATA has three rows (index 0,1,2) and four columns
		 *  	(index 0,1,2,3).
		 *  2.	To access a single element we use DATA[row][column]
		 *  	For example DATA[1][2] will give us 7.
		 *  3.	Think of a 2D array as an Array of Arrays, this is 
		 *  	really helpful when performing some algorithms.
		 *   	For example we can access an entire row using the 
		 *   	notation DATA[row].  For example DATA[0] returns 
		 *   	{1,2,3,4}
		 *  4.	We often think of 2D arrays as rows and columns
		 *  	please be sure to use this as a default.  However
		 *  	we can modify our thinking to use x and y
		 *  5.	We can think about accessing elements in ROW MAJOR
		 *  	which means we move across the row first. If asked
		 *  	to print out DATA in row major you would get
		 *  	1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12
		 *  6.	We can think about accessing elements in COLUMN MAJOR
		 *  	which means we move across the columns first.  If asked
		 *  	to print out DATA in column major you would get 
		 *  	1, 5, 9, 2, 6, 10, 3, 7, 11, 4, 8, 12
		 *  7.	
		 *  	
		 */
		
		/* COMMON QUESTION:
		 * 
		 *  1. 	Find the sum of all the elements in 2D array of integers
		 *  	called DATA
		 *  2. 	Print out a 2D array called DATA in row major order.
		 *  3.	Print out a 2D array called DATA in column major order.
		 *  4.	Given an 2D array of Strings called WORDS print out the
		 *  	average length.
		 *  5. 	Given a 2D array of integers called DATA print out the 
		 *  	sum of odd indexed rows
		 *  6.	Given a 2D array of doubles called DATA find the sum of 
		 *  	the elements that make of the perimeter of the 2D structure. 
		 *  	For example using DATA from above it out print 
		 *  	TOP ROW       | LEFT SIDE| BOTTOM ROW       | RIGHT SIDE|
		 *  	1 + 2 + 3 + 4 +     8    + 12 + 11 + 10 + 9 +      5	
		 *  7. 	Given an array called DATA, create a new 2D array called 
		 *  	RESULTS which is the array transposed.  A transposed
		 *  	array is one where the rows become the columns and the 
		 *  	columns become the rows.  For example DATA from above
		 *  	would result in the following 2D array when transposed
		 *  
		 *	DATA = { { 1,  5,  9},
		 * 			 { 2,  6, 10},
		 * 			 { 3,  7, 11},
		 * 			 { 4,  8, 12} 
		 * 		  }	
		 * 
		 *	8.	Given a 2D array of integers called DATA print the sum
		 *		of the diagonals if the DATA is square.  If it is not 
		 *		square print out -1. For example DATA from above would 
		 *		print -1 since it is not square.  Given DATA below it would
		 *		print out 1 + 5 + 9 + 7 + 3.  Do not double count the 
		 *		middle element 5. 
		 *
		 *		DATA = {{1, 2, 3},
		 *				{4, 5, 6},
		 *				{7, 8, 9}}
		 *  	
		 *	9. 	Given a 2D array of integers called DATA print out true 
		 *		if it is a magic rectangle.  A magic rectangle is one where
		 *		the sum of all the rows and columns are equal.
		 *
		 *	10.	Given a 2D array called DATA that only contains ones and 
		 *		zeros, create a 1D array called COMPRESS which stores the 
		 *		indexes of all the locations in DATA that contain a 1. 
		 *		If and when would be the benefitical to change a large 2D 
		 *		array into this format
		 *
		 *		DATA = {{1,0,0},
		 *				 1,0,1}
		 *			   }	
		 *					R,C,R,C,R,C
		 *		COMPRESS = {0,0,1,0,1,2}
		 *  
		 *  
		 *  
		 *  
		 *  
		 *
		 */
		
		
		int[][] data = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		int[] row0 = data[0]; //stores first row of data
		int num = data[1][2]; //stores value at row 2 column 3 which is 7
		
	}
}


