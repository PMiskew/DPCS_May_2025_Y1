/**
 * Tools class:
 * This will be a collection of methods that we use 
 * to demonstrate our learning and practice skills
 * 
 * You will submit this as part of your first assignment
 * 
 * Every method in your tools class is static
 * 
 */
public class $PM {
	
	
	/**
	 * This method returns the max value in a list of integers
	 * @param a
	 * @return
	 * 
	 * precondition: a.length > 0
	 * 
	 */
	public static int findMax(int[] a) {
		
		
		int max = a[0];
			
		for (int i = 0; i < a.length; i = i + 1) {
			
			if (a[i] > max) {
				max = a[i];
			}
			
		}
		
		return max;
		
	}//end findMax

	/**
	 * This method returns the max value in a list of integers
	 * @param a
	 * @return
	 * 
	 * precondition: a.length > 0
	 * 
	 */
	public static String findMax(String[] a) {
		
		
		int max = a[0].length;
			
		for (int i = 0; i < a.length; i = i + 1) {
			
			if (a[i].length() > max) {
				max = a[i];
			}
			
		}
		
		return max;
		
	}//end findMax
	/**
	 * This method finds the min of an array of ints
	 * @param a
	 * @return
	 * 
	 * precondition: a.length >0
	 */
	public static int findMin(int[] a) {
		
		
		int min = a[0];
			
		for (int i = 0; i < a.length; i = i + 1) {
			
			if (a[i] < min) {
				min = a[i];
			}
			
		}
		
		return mix;
		
	}//end findMax
	
	/**
	 * String A - One Pager #3
	 * @param s
	 * @param v
	 * @return
	 * preconditions v >= 0
	 * postconditions
	 */
	public static String pullN(String s, int v) {
		
		if (v >= s.length()) {
			return s;
		}
		
		return s.substring(0,v);
		
			
		
		
	}// end pullN
	
	
	/**
	 * String A - One Pager #5
	 * @param s
	 * @return
	 */
	public static String findMiddle(String s) {
		
		//BIG SKILL: Check if a number is ever or odd
		int len = s.length();
		
		if (len < 3) {
			return "";
		}
		
		//MOD gives the remainder when we divide two numbers
		//If we mod a number by 2 odd numbers get 1 even numbers get 0
		if (len % 2 == 0) {
			// 012345
			// Hello!
			//len/2 -1 + 2 - (len/2 - 1) = len/2 - 1 + 2 - len/2 + 1 = 2
			return s.substring(len/2 - 1, len/2 +1);
			
		}
		
		// 01234
		// Hello
		//INTEGER DIVISION: 
		return s.substring(len/2,len/2 + 1);
		
		
		
		
	}
	
	
	/**
	 * This method takes a string and a character and returns
	 * the first index of the character in the string. If 
	 * the character is not in the string then it returns
	 * -1. PRECONDITION is that the string can be any length
	 * 
	 * @param str
	 * @param value
	 * @return
	 */
	public static int findLetter(String str, char value) {
		
		//We are going use a LINEAR SEARCH. A linear 
		//search is where we go through each value 
		//in order and check if it is what we want. 
		
		//Step 1: Loop through every index in str using 
		//		  a for loop ESSENTIAL STRUCTURE
		
		//		COUNT		CHECK			CHANGE
		for (int i = 0; i < str.length(); i = i + 1) {
			char letter = str.charAt(i);
			
			if (letter == value) {
				return i;
			}
			
			
		}
		
		
		return -1;
		
	}


}
