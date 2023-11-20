import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Tool2 {

	public static void main(String[] args) {
		
		/*
		 * A null refernce is when the memory location for a reference variable 
		 * doesn't point anywhere. 
		 * 
		 * NOTE: even though String is spelt with a capital S it functions like a primitive 
		 * type
		 */
		
		//Test Code reverseWordA
		/*
		System.out.println(reverseWordA("Paul"));
		System.out.println(reverseWordA("12345643"));
		System.out.println(reverseWordA(""));
		System.out.println(reverseWordA("Paul is great!"));
		System.out.println(reverseWordA("P"));
		
		String reverseWordAT1 = null;
		System.out.println(reverseWordA(reverseWordAT1));
		*/
		
		//Create an array of Strings with three elements
		String[] randomWords = null;
		
		reverseWordB2(randomWords);
		
		//Output result using Arrays.toString

		System.out.println(Arrays.toString(randomWords));
		
		
		
		
		
		
		
		
		
	}
	
	/**
	 * This method takes a string parameter and returns the 
	 * word in reverse. For example if word = "cat" the method
	 * would return "tac"
	 * 
	 * The method should return a null reference if the String passed
	 * is null. 
	 * @param word
	 * @return
	 */
	public static String reverseWordA(String word) {
		
		if (word == null) {
			return null;
		}
		String result = ""; //string contruction
		
		for (int i = word.length() - 1; i >= 0; i = i - 1 ) {
			result = result + word.charAt(i);
		}
		return result;
	}
	
	
	/**
	 * This method takes an array of Strings and returns an array of Strings where each element 
	 * is reversed. 
	 * 
	 * Precondition: words can be any length or null reference
	 * PostCondition: words is left unchanged
	 * @param words
	 * @return
	 */
	public static String[] reverseWordB1(String[] words) {
		
		String[] results = new String[words.length]; //create a an array of Strings the same length
		
		//loop through words
		for (int i = 0; i < words.length; i = i + 1) {
			
			//store words[i] in a temp variable
			String word = words[i];
			
			results[i] = reverseWordA(word);
		}
		return results;
	}
	
	/**
	 * This method takes an array of Strings and returns an array of Strings where each element 
	 * is reversed. 
	 * 
	 * Precondition: words can be any length or null reference
	 *
	 * @param words
	 * @return
	 */
	public static void reverseWordB2(String[] words) {
		
		try {
			
		
			//loop through words
			for (int i = 0; i < words.length; i = i + 1) {
				words[i] = reverseWordA(words[i]);
			}
		
		}
		catch (NullPointerException e) {
			System.out.println("Your array is null");
			return;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static Stack<String> reverseWordC(String[] words) {
		return null;
	}
	
	public static Queue<String> reverseWordD(Queue<String> words) {
		return null;
	}

}
