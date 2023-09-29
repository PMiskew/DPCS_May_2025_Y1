/*
 * 
 * This code shows some essential string approaches that are good
 * to have you in your back pocket.  By no means is this exhaustive
 * but it does highlight some essential ideas. 
 */
public class StringEssentials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String is a primitive variable type. 
		//A primitive variable type is one that PASSES BY VALUE
		String w1 = "words and words";
		
		//There are two strings that exist
		String w2 = w1;
		
		//When I add strings together it is called CONCATINATION
		w1 = w1 + "!";
		System.out.println(w1);
		System.out.println(w2);
		
		//Common mistake: We cannot substract string
		//w1 = w1 - "!"; //BAD
		
		//How do I remove letters from strings?
		//	To do this you have to rebuild the string. 
		
		//This is useful in CodingBat String 2
		//We can cheat a little
		String w3 = "catdog";
		//String collapsing 
		w3 = w3.replaceAll("cat","");
		System.out.println(w3);
		
		//substring;
		String w4 = "I love pizza";
		String w5 = w4.substring(2,6); //6 - 2 = 4 lenght of the new word
		System.out.println(w5);
		
		
		//substring: Overloading
		//substring is an overloaded method.  An overloaded method is 
		//a method where there are multiple version of it with the 
		//same name but different parameters.  Java picks the right
		//version based on the parameter. 
		
		String w6 = "I only want the END";
		String w7 = w6.substring(16);
		System.out.println(w7);
		
		
		//indexOf
		//this returns the index of the first instance of a substring
		//This is much more robust because you can manage any string!
		String w8 = "I only want the END";
		int loc1 = w8.indexOf("END");
		String w9 = w6.substring(loc1);
		System.out.println(w7);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
