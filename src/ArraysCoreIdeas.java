
public class ArraysCoreIdeas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Arrays are a DATA STRUCTURE. A DATA STRUCTURE in computer science is a
		 * structure that we use to store information.  There are LOTS of DATA STRUCTURES. 
		 * 
		 * Part of being a good programmer is picking the right data structure for the
		 * right situation.  
		 * 
		 * What is an array?
		 * 
		 * An array is a STATIC data structure.  What this means is we MUST know the size
		 * of the array before we use it. 
		 * 
		 * 
		 * 
		 */
		
		//nums1 and nums2 are declared with nothing in them all the values get
		//defaulted to 0
		int[] nums1 = new int[5]; //stores 5 integers nums1 = {0,0,0,0,0}
		int nums2[] = new int[4]; //stores 4 integers nums2 = {0,0,0,0}
		
		
		
		//With an array we always rely on two things.  
		//First we always note the length of the array. 
		//Second we always know the indexes.  The index values for an array
		//are ALWAYS 0 to the length - 1
		
		//nums3 
		//             0 1 2 3 4 5 
		int[] nums3 = {1,4,2,6,7,8};  //length of 6 with indexes 0 to 5
		
		System.out.println(nums3); //this outputs something funny?
		
		//An array is called a REFERENCE VARIABLES this means it stores a reference
		//to where the data is. So if I try to print out an array I get memory reference
		
		System.out.println(nums3[1]); //we say this as "nums at 1"
		System.out.println(nums3[3]); //this will print out 6
		
		nums3[5] = 99; //this reset the 5th index to 99 nums3 = {1,4,2,6,7,99}
		System.out.println(nums3[5]);
		
		//We refer to each value as an ELEMENT. 
		
		//Q: For my project I need to 
		
		/*
		ICS3U Assignment: Secret Code

		Agents at the LHS secret foundation often have to exchange information.  
		It is very important that no one outside the foundation has access to 
		this information.  Therefore, you have to write a program to encrypt all 
		the messages that are sent out.

		Each line of a message consists of 7 words, separated by spaces. 
		The last two words are always integers.

		e.g.	Another Sunrise Another New Beginning 1234 5678

		The seven words are:
		Another 
		Sunrise 
		Another 
		New 
		Beginni
		*/
		
		//Another Sunrise Another New Beginning 1234 5678//
		
		//Step 1: Create an array with each of these elements
		//There are two ways to do this. 
		/*
		//Approach 1: Create an array of length 7 then manually set each values
		String words[] = new String[7]; //create the array
		//manually set each value
		words[0] = "Another";
		words[1] = "Sunrise";
		words[2] = "Another";
		words[3] = "New";
		words[4] = "Beginning";
		words[5] = "1234";
		words[6] = "5678";
		*/
		
		//Approach 2: I know the values before starting so set them immedietly. 
		
		String words[] = {"Another", "Sunrise", "Another", "New", "Beginning", "1234", "5678"};
		
		//ENCRIPTION 1: Reverse all letters
		//To do this we would use string construction.  Loop through all letters in reverse
		//and build a new string
	
		//Core Approach: Reverse Word - we can loop through the word in reverse adn build a 
		//new string.  Then copy the new string back into word[0]
		//Step 1: Get the value from words
		String word = words[0];
		String tword = "";
		int wordLength = word.length();
		
		for (int i = wordLength - 1; i >= 0; i = i - 1) {
			tword = tword + words[0].charAt(i);
		}
		
		words[0] = tword; // copy reversed word into words[0]
		
		System.out.println(words[0]);
		//ENCRIPTION 2: exchange first and last character, the rest of the characters are
		//				shifted to the character three before it in the ASCII table (works 
		//				for non-letters as well.
		//Core Idea: This is checking to see if students understand how to cast characters 
		//to integers and then back into char.  This is how you shift the position of the letter
		//Core Idea: characters to integers. 
		
		tword = "";
		wordLength = words[1].length();
		//Step 1: Start with last letter
		tword = "" + words[1].charAt(wordLength - 1);
		
		//Step 2: Loop from second elements to second last element and convert letter position
		for (int i = 1; i < wordLength - 1; i = i + 1) {
			
			int a = words[1].charAt(i); //store character as integer
			a = a - 3;
			char b = (char)a; //cast int back to character.
			tword = tword + b;
		}
		
		//Step 3: add first letter
		tword = tword + words[1].charAt(0);
		words[1] = tword;
		System.out.println(words[1]);
		
		
		//ENCRIPTION 3: Word #3: for each of the first and last characters, if it is a uppercase, replace it
		//with ‘U’, otherwise, replace it with ‘u’; the rest of the characters are replaced by ‘*’
		//Another-->U*****u
	
		//Step 1: 	Check first letter.  You can check if upper or lower case by checking the 
		//			ASCII character. 
		
		char fletter = "" + words[2].charAt(0);
	
		int fletterint = (int)fletter;
				
		//This checks if it is upper case
		if (fletterint >=65 && fletterint <= 90) {
			(fletter + "").toUpperCase()
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
