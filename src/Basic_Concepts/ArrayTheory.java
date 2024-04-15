package Basic_Concepts;

public class ArrayTheory {

	public static void main(String[] args) {

		/*
		 * 
		 * An array is an example of a DATA STRUCTURE
		 * 
		 * A DATA STRUCTURE is a structure that is used in programming to 
		 * store and manage data/information. 
		 * 
		 * There are lots of data structure out there.  An array is one type of 
		 * data structure
		 * 
		 * Some other examples include
		 * 	-	2 Dimensional Arrays, 3 Dimensional Arrays, . . . . 
		 *	- 	Stack
		 *	- 	Queues
		 * 	- 	Lists (people will think of lists and arrays as the same but they are not)
		 *  
		 *  
		 * All data structure are REFERENCE TYPES
		 * 
		 *  int x = 9;  //we store the nine right inside of x
		 *  int[] nums = {1, 2, 3} //we store a REFERENCE to the values
		 *  
		 *  Memory 
		 *  |--------------------|
		 *  |			     	 |
		 *  |	x	nums	     |
		 *  |  |-|	|-|		     |
		 *  |  |9|  |----->1,2,3 |
		 *  |  |-|	|-|			 |
		 *  |--------------------|
		 *  
		 */
		
		//There are two ways to declare arrays
		
		//This is how we declare and initialize an array to a set of values
		double[] dNums1 = {1.2, 6.7, 9.9, 102.2, -99.3, 1023, 123, 3421};
		
		//This creates an array of lenght of 5 and initializes all the values to 0
		double[] dNums2 = new double[5];
		
		//When we print out an array Java doesn't know what you want to print out
		//so it prints out what is stored in the "box" in memory. 
		//The box stores a location in memory
		//[D@6bf2d08e
		//6bf2d08e is an hexadecimal memory location
		System.out.println(dNums1);
		
		//In order to print all the elements of an array we need to use a loop
		/*
		 * There two types of loops in programming
		 * 		Conditional Loop: while loop and you do while loops
		 * 		Counted Loop: for loop
		 * 
		 * Which one is better?  
		 * 
		 * 	You can use either loop in any situation, but there are some tricks to 
		 *  make you code better. 
		 *  
		 *  Question: Do you know in advance how many times the loop should run? 
		 *  
		 *  If you know in advance how many times a loop should run then a counted
		 *  loop is better. 
		 *  
		 *  print out all the elements in an array --> FOR LOOP
		 *  
		 * 
		 */
		//	 count    ;  check           ; change
		for (int i = 0; i < dNums1.length; i = i + 1) {
			System.out.println(dNums1[i]);
		}
		
		System.out.println("***********************");
		//It is good to point out that we can actually loop through an array
		//using a conditional loop (while loop) 
		
		int i = 0; //count
		
			   //check
		while (i < dNums1.length) {
			System.out.println(dNums1[i]);
			
			i = i + 1; //change
			
			//we check our conditional again if true run loop again
		}
		

		//Notice with strings we write length() --> This tells us that 
		//length is method that is run
		//With arrays we write length --> This tells me that it is a value 
		//we access
		String s = "cat";
		System.out.println(s.length());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
