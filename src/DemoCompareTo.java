
public class DemoCompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "a";
		String s2 = "b";
		String s3 = "cat";
		String s4 = "dog";
		String s5 = "CAT";
		
		/*
		 * .equals compares <var 1>.equals(<var 2>) the two
		 * variables and returns true if they are the same 
		 * and false otherwise.
		 * 
		 */
		System.out.println(s1.equals(s2)); //false
		System.out.println(s3.equals(s5)); //"cat" is the equal to "CAT"
		System.out.println(s3.equalsIgnoreCase(s5)); //returns true
		
		//compareTo gives the difference between the two words alpahabetically. 
		//This is really useful if you want to check two words in terms of their
		//alphabetical order.
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1));
		
	}

}
