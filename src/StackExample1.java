import java.util.Stack;

public class StackExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Step 1: 	Create a stack of ints called s1
		Stack<Integer> s1 = new Stack<Integer>();
		
		//Step 2: 	Create a stack of ints called s2
		Stack<Integer> s2 = new Stack<Integer>();
		
		//Step 3: 	Populate s1 with some values using the push
		//			function
		
		//Step 3.5: Using a loop the the Math class populate a random 
		//			number of elements and push them onto s1. 
		
		//This will generate an integer 0 <= num < 100
		//Math.random() returns a double d such that 0 <= d < 1.0
		//The part Math.random()*100 will generate a double value
		//Since we want to put in an integer we need to CAST to an 
		//int - CASTING is the process of changing type
		//When we CAST an int to a double we CHOP OFF decimal
		int num = (int)(Math.random()*100);
		
		
		for (int i = 0; i < num; i = i + 1) {
			//This will generate  an integer 0 <= value < 50
			int value = (int)(Math.random()*50);
			s1.push(value);
		}
		//I can print out stacks in Java easily
		//There is a reason for this we will talk about later
		System.out.println(s1);
		//Step 4: Copy all the elements of s1 into s2
		while (s1.isEmpty() == false) {
			int t = s1.pop();
			s2.push(t);
			
			
		}
	
	}

}
