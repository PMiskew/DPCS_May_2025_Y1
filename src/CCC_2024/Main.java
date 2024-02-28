package CCC_2024;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		//String a = "forloops";
		//String b = "fxrlxxp ";
		
		//String a = "forloops";
		//String b = "frlpz";
	
		String a = s.next();
		String b = s.next();
		
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
		
		System.out.println(letters);
		
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
					secret = '-';
				
			}
			
			
		}
		
		
		
		System.out.println(silly+" "+sillyR);
		System.out.println(secret);
		
		
				
		
		
	}

}
