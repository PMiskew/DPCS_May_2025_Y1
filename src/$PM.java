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
