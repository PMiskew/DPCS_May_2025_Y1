package CCC_2024;

import java.util.ArrayList;
import java.util.Scanner;

public class J4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		String a = "sssss";
		String b = "";
		
		//String a = "forloops";
		//String b = "fxrlxxp ";
		
		//String a = "forloops";
		//String b = "frlpz";
		
		//String a = "forloops";
		//String b = "fxlps";
		
		String c = "";
		int diff = a.length() - b.length();
		
		int offset = 0;
		
		ArrayList<Character> letters = new ArrayList<Character>();
		
		char secret = '-';
		char silly = '-';
		char sillyR = '-';
		
		
		//FIND SILLY
		c = b;
		
		for (int i = 0; i < a.length(); i = i + 1) {
			
			String cTemp = c;
			cTemp = c.replaceAll(""+a.charAt(i), "");
		
			if (cTemp.equals(c)) {
				letters.add(a.charAt(i));
			}
			
			c = cTemp;
		}
		
		if (c.length() > 0) {
			sillyR = c.charAt(0);
		}
		
		//letters now contains both the silly and the secret keys
		letters.sort(null);
		
		System.out.println(letters);
		//System.out.println(diff);
		
		letters.sort(null);
		
		
		
		//5 cases 
		// A) no secret, no silly 
		// B) secret and silly 
		// C) no secret and silly
		// D) secret and no silly
		// E) no secret and no silly
		if (letters.size() > 0) { //BCDE
			
			int count = 1;
			
			for (int i = 1; i < letters.size(); i = i + 1) {
			
				if (letters.get(i) == letters.get(0)) {
					count = count + 1;
				}
			}
			
			
			if (count == diff) {
		
				secret = letters.get(0);
				
				if (letters.size() > 1) 
					silly = letters.get(letters.size() - 1);
			}
			else if(count != diff) {
				
				silly = letters.get(0);
				
				if (letters.size() > 1) 
					secret = letters.get(letters.size() - 1);
				
			}
			
			
		}
		
		
		
		System.out.println(silly+" "+sillyR);
		System.out.println(secret);
		
		
				
		
		
	}
	
	
	/*
	 * Attempt 1
	 ArrayList<Integer> check = new ArrayList<Integer>();
		ArrayList<Integer> secretIndex = new ArrayList<Integer>();
		char secretKey = '*';
		String silly = "";
		char sillyReplaced = ' ';
		
		
		//find secret key
		//if b length is smaller no secret key.
		if (b.length() < a.length()) {
			
			for (int i = 0; i < a.length(); i = i + 1) {
				
				boolean found = false;
				
				for (int j = 0; j < b.length(); j = j + 1) {
					
					if (a.charAt(i) == b.charAt(j)) {
						found = true;
						
						break;
					}
					
				}
				
				if (found == false) {
					secretIndex.add(i);
					secretKey = a.charAt(i);
				}
				
			}//end for
			
		}//end if
	
		//Find Silly Key
		for (int i = 0; i < a.length(); i = i + 1) {
			
			if (!b.contains(""+a.charAt(i)) && a.charAt(i) != secretKey ) {
				
				silly = ""+a.charAt(i);
				break;
			
			}
				
			
			
		}
		
		
		
		//Find replacement for silly key
		
		for (int i = 0; i < b.length(); i = i + 1) {
			
				if (!a.contains(""+b.charAt(i))) {
				
					sillyReplaced = b.charAt(i);
					break;
			
			}
		}
			
		
		System.out.println(silly+" "+sillyReplaced);
		System.out.println(secretKey);
		
	
	 *
	 *
	 */

}
