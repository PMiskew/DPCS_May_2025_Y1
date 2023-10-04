
public class Nested_Loop_Example {

	public static void main(String[] args) {
		
		/*
		 
		for (int i = 1; i < SIZE; ) {
			
			for (int j = SIZE; j >= i; j--) {
				System.out.print("*");		
			}
		
			System.out.println();
			
			//apply change to i 
			//check again
		}
		
		
		
		Memory 										OUTPUT 
		
		i | i < 5   | j  | j >= i   | 
		1 | 1 < 5 T | 5  | 5 >= 1 T |  *
		              4  | 4 >= 1 T |  **
		              3  | 3 >= 1 T |  ***
		              2  | 2 >= 1 T |  ****
		              1  | 1 >= 1 T |  				*****
		              0  | 0 >= 1 F |
		2 | 2 < 5 T | 5  | 5 >= 2 T	|  *
					  4  | 4 >= 2 T |  **
					  3  | 3 >= 2 T |  ***
					  2  | 2 >= 2 T |  				****
					  1  | 1 >= 2 F | 
		3 | 3 < 5 T | 5  | 5 >= 3 T |  *
		 			  4  | 4 >= 3 T |  **
		 			  3  | 3 >= 3 T |  				***
		 			  2  | 2 >= 3 F |
		4 | 4 < 5 T | 5  | 5 >= 4 T |  *
		  		    | 4  | 4 >= 4 T |  				**		
		  		    | 3  | 3 >= 4 F |
		5 | 5 < 5 F 
		  
		EXIT LOOP
		 			  
					  
		 
		              
		                
		OUTPUT
		
		*****
		****
		***
		**
		
		
		
		*/
		
		//Any time we see an all caps we know it is a constant
		//To set a constant in Java we use the MODIFIER final
		//Q: Why would we use constants
		//		A: Memory benefits 
		//		B: It stops anyone from changing the value. 
		
		final int SIZE = 5;
				
		//	(<count>  ; check  ; change)
		// count - int i = 1; sets the count variable to 1 that is used in the loop
		
		// check - the check get Checked at the end of the loop 
		// If check is true it runs the loop
		// change - i++ is the same as i = i + 1
		// check again - if true run the loop again else move on. 
		
		for (int i = 1; i < SIZE; i = i + 1) {
			
			for (int j = SIZE; j >= i; j--) {
				System.out.print("*");		
				
			}
		
			System.out.println();
			
			//apply change to i 
			//check again
		} //end of the for loop with i counter
		
		//Q: Is this like a while loop
		
		//A: This is exactly like a while loop.  
		// 	 A while loop is called a CONDITIONAL LOOP
		//	 A for loop is called a COUNTED LOOP
		//
		//Q: 	When do I know how to use each loop 
		//A:	You can use while loop (CONDITIONAL LOOPS) or for loops
		//		(COUNTED LOOP).  If you know in advance how many times 
		//		something is going to run use a COUNTED LOOP.  If you don't
		//		use a CONDITIONAL LOOP> 
		//		
		//		COUNTED LOOP: Count loop is used in a lot of standard math 
		//		type question or searching arrays because we know how many 
		//		times the loop has to run
		//		CONDITIONAL LOOP: This is often used in situations where
		//		you don't know how many times the loop will run.  For example
		//		if you ask someone to input a number between 1 and 100 
		//		a CONDITIONA LOOP is perfect. 
		//
		
		//Q: What exactly is i++
		//A: 	i++ is short hand in programming and means
		// 		i = i + 1 which means take whatever is in i and
		//		add 1. 
		
		
	}

}
