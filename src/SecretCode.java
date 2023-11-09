import java.util.Arrays;
import java.util.Scanner;

public class SecretCode {

	public static void main (String[] args) {
		
		
		/*
		* Using classes and objects
		*   
		*/
		//  REFERENCE Type = new OBJECT type
		Scanner s = new Scanner(System.in);
		
		
		/*
		 * With this question the input is always seven words with 6 spaces.  This is
		 * what we call a pre-condition
		 */
		//String sentence = s.nextLine();
		String sentence = "Another Sunrise Another New Beginning 1234 5678";
		
		/*
		 * Skill: How do I take a string and put each word in an array?
		 */
	
		//Approach 1: 	Using a built in instance method called split. What split does
		//				is it takes a string as an implied object and the method takes
		//				a single parameter which indicates what to "split" the string 
		//				for each element in the array
		
		//String[] words = sentence.split(" ");
		
		//Approach 2:	We can do the same thing using a loop.  This is not the best way
		//			 	way to do it because we have the split method. But it is excellent
		//				for learning
		
		
		//Step 1: Count the number of spaces in the string sentence
		String sentenceTemp = sentence.replaceAll(" ","");  //string collapsing 
		
		int count = sentence.length() - sentenceTemp.length();
		
		String[] words = new String[count + 1]; //6 spaces we will have 7 elements
	
		int index = 0;
		
		int pos1 = 0;
		int pos2 = 0;
		// 1
		// 2
		//"Another Sunrise Another New Beginning 1234 5678";
		
		while (pos2 < sentence.length()) {
			
			if (sentence.charAt(pos2) == ' ') {
				words[index] = sentence.substring(pos1,pos2);
				pos1 = pos2 + 1;
				index = index + 1;
			}
			pos2 = pos2 + 1;
		}
		
		words[index] = sentence.substring(pos1,pos2);
		
		/*
		 * 
		 * Skill: How do I print out all the elements in an array
		 * 
		 */
		//Approach 1: Use a built in static method from Arrays class called toString
		
		System.out.println(Arrays.toString(words));
		
		
		//encryption 1: Reverse String
		System.out.println("*****************************E1*****************************");
		
		//There are two ways to go about this problem and they highlight really important skills
		//
		//Approach 1: 	We loop through the string from end to start and we add the letters to a new string
		//				This is a technique called String construction
		
		
		/*
		String temp1 = ""; //step 1: create an empty string
		
		
		//Step2: We loop through the string starting at the last index. 
		for (int i = words[0].length() - 1; i >= 0; i = i - 1) {
			temp1 = temp1 + words[0].charAt(i);
		}
		*/
		
		/*
		i  | i >= 0    |  temp1                             |  i = i - 1
		----------------------------------------------------------------- 
		6  | 6 >= 0 T  | temp1 = "" + "Another".charAt(6)   |  i = 6 - 1
		   |           |       = "" + "r"                   |  i = 5
		   |           |       = "r"                        |
		5  |  5 >= 0 T | temp1 = "r" + "e" = "re"           |  i = 4
		4  |  4 >= 0 T | temp1 = "re" + "h" = "reh"         |  i = 3
		3  |  3 >= 0 T | temp1 = "reh" + "t" = "reht"       |  i = 2
		2  |  2 >= 0 T | temp1 = "reht" + "o" = "rehto"     |  i = 1
		1  |  1 >= 0 T | temp1 = "rehto" + "n" = "rehthon"  |  i = 0
		0  |  0 >= 0 T | temp1 = "rehto" + "A" = "rethonA"  |  i = -1
		-1 | -1 >= 0 F	 
		*/
		
		//APPROACH 2:   We loop through the string from 0 to the end of the string.  
		//  			We still construct a string, we just do it differencely by adding the new character
		//				to the front of the string.
		String temp1 = "";
	
		for (int i = 0; i < words[0].length(); i = i + 1) {
			temp1 = words[0].charAt(i) + temp1; 
		}
		
		words[0] = temp1;
		System.out.println(words[0]);
		
		/*
		i  | i < 7     |  temp1                             |  i = i + 1
		----------------------------------------------------------------- 
		0  | 0 < 7  T  | temp1 = "Another".charAt(0) + ""   |  i = 0 + 1
		   |           |       = "A" + ""                   |  i = 1
		   |           |       = "A"                        |
		1  |  1 < 7  T | temp1 = "n" + "A" = "nA"           |  i = 2
		2  |  2 < 7  T | temp1 = "o" + "nA" = "onA"         |  i = 3
		3  |  3 < 7  T | temp1 = "t" + "onA" = "tonA"       |  i = 4
		2  |  4 < 7 T  | temp1 = "h" + "tonA" = "htonA"     |  i = 5
		1  |  5 < 7 T  | temp1 = "e" + "htonA" = "ehtonA"   |  i = 6
		0  |  6 < 7 T  | temp1 = "r" + "ehtonA" = "rethonA" |  i = 7
		-1 |  7 < 7 F	 
		*/
		
		
		System.out.println("*****************************E2*****************************");
		//Encryption 2: Character Shift
		/*
		 * Skill: 
		 * 		- Understand how to cast between characters and integers
		 * 		- Understand how to modify the loop to go through some of the string
		 */
		String temp2 = "";
		int l2 = words[1].length();
		
		temp2 = ""+ words[1].charAt(l2-1); // temp2 = "e"
		
		for (int i = 1; i < words[1].length() - 1; i = i + 1) {
			
			//CASTING is a term used in computer science to explain how we change type. 
			
			/*
			                    X
			abcdefghijklmnopqrstuvwxyz
			
			ABCDEFGHIJKLMNOPQRSTUVWXYZ
			*/
			
			//Example character is u we cast the u into an int and get 117
			int ci = (int)(words[1].charAt(i)); // gets the u and converts it to 117
			ci = ci - 3; //117 becomes 114
			char c = (char)(ci); //cast 114 back to a character it becomes a r
			temp2 = temp2 + c; //add the r to our string temp2
		}
		temp2 = temp2 + words[1].charAt(0);
		words[1] = temp2;
		
		System.out.println(temp2);
		

		
		System.out.println("*****************************E3*****************************");
		
		int cf = (int)(words[2].charAt(0)); //I get the integer value of the first letter --> Letter is A which is 65
		int l3 = words[2].length(); //I get the length of the string
		int cl = (int)(words[2].charAt(l3 - 1)); //I get the integer value fo the last letter --> Letter is r which is 114
		
		String temp3 = ""; //This is the string I will build
		
		//check if first letter is upper case
		if (cf >= 65 && cf <= 90) { //since capital letters are between 65 and 90 we know this will be a capital
			temp3 = "U";
		}
		else {
			temp3 = "u";
		}
		
		for (int i = 1; i < l3 - 1; i = i + 1) {
			temp3 = temp3 + "*";
			
		}
		
		//check if the last letter is upper case
		if (cl >= 65 && cl <= 90) {
			temp3 = temp3 + "U";
		}
		else {
			temp3 = temp3 + "u";
		}
		
		words[2] = temp3;
		System.out.println(temp3);
		
		

		
		System.out.println("*****************************E4*****************************");
		
		int num = 0;
		int l4 = words[3].length();
		
		num = (int)(Math.random()*l4*300 + 151);
		String temp4 = "" + num;
		words[3] = temp4;
		System.out.println(temp4);
		
		System.out.println("*****************************E5*****************************");
		
		
		String temp5 = "";
		int l5 = words[4].length();
		
		//Why do I need the "";
		temp5 = ""+ words[4].charAt(l5 - 2) + words[4].charAt(l5 - 1);
		
		for (int i = 0; i < l5 - 2; i = i + 1) {
			temp5 = temp5+words[4].charAt(i);
		}
		
		words[4] = temp5;
		System.out.println(temp5);
		
		
		System.out.println("*****************************E6*****************************");
		
		int temp6 = Integer.parseInt(words[5]);
		temp6 = temp6 - 20000;
		temp6 = Math.abs(temp6);
		
		words[5] = "" + temp6;
		System.out.println(temp6);
		
		System.out.println("*****************************E7*****************************");
		
		double temp7 = Integer.parseInt(words[6]);
		temp7 = Math.sqrt(temp7);
		temp7 = Math.round(temp7);
		
		words[6] = "" + (int)(temp7);
		System.out.println(temp7);
		
		System.out.println(Arrays.toString(words));
		
	}
	
	
}
