package Miskew_Prep_Work;

import java.util.Scanner;

public class DollarWords {

	public static void main(String[] args) {
		
		char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int[] values = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
		
		Scanner s = new Scanner(System.in);
		String word = "";
		
		while (word != "exit") {
			
			int total = 0; 
			
			System.out.print("Input word: ");
			word = s.nextLine();
			
			for (int i = 0; i < word.length(); i = i + 1) {
				
				for (int j = 0; j < values.length; j = j + 1) {
					
					if (letters[j] == word.charAt(i)) {
						total = total + values[j];
						break;
					}
				}
			}
			System.out.println(total);
				
		}
	}
}
