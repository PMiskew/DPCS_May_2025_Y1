package Miskew_Prep_Work;

import java.util.Scanner;

public class DollarWords {

	public static void main(String[] args) {

		System.out.println(doThis("xabcxxx"));		
	}
		
		
	public static String doThis(String str) {
			
			if (str.length() == 0) {
				return "";
				
			}
			if (str.charAt(0) == 'x') {
				return doThis(str.substring(1)) + "!";
			}

			return doThis(str.substring(1)) + str.charAt(0);		
	}
}

