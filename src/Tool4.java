import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class Tool4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> q1 = generateIntegerArrayList(3,10,false);
		
		System.out.println(q1);
		
		Stack s1 = copyArrayListToStack(q1, true);
		System.out.println(q1);
		
		
		/*
		 * These look like referecen types but they are called Wrapper classes and act as primirive types
		 * 
		 */
		
		String s = "Paul";
		Integer i = 0;
		Double d = 99.8;
		Character c = 'a';
	}

	
	/**
	 * 
	 * In our HL class we were going to implement a Queue, but realized it
	 * is an INTERFACE - we are not ready for these. 
	 * Therefore we modified this question to work on the FIFO principle 
	 * of queues.  This method creates an ArrayList which we will treat like
	 * a queue. 
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static ArrayList<Integer> generateIntegerArrayList(int a, int b, boolean debug) {
		
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		for (int i = 0; i < a; i = i + 1) {
		
			int rand = (int)(Math.random()*(b+1));
			
			/*
			 * The overloaded version of add that takes two parameters is what allows 
			 * us to treat this like queue.  When add take two parameters the first
			 * parameter is where to insert the value, which is the second parameter,
			 * into the list. 
			 */
			temp.add(0,rand);
			
			if (debug == true) {
				System.out.println(temp);
			}
		}
		
		return temp;
	}
	
	/**
	 * This method takes an Arraylist of integers and copies all the elements into 
	 * a new stack such that the list appears in the stack with the start of the list at the
	 * bottom and the end of the list at the top. 
	 * 
	 * example data = {1,2,3} shoudl return stack = {1,2,3}
	 * Postcondition - data remains unchanged when method is done. 
	 * @param data
	 * @return
	 */
	public static Stack<Integer> copyArrayListToStack(ArrayList<Integer> data, boolean debug) {
	
		Stack temp = new Stack<Integer>();
		
		while (!data.isEmpty()) {
			
			//NICE TRICK - NOTICE REMOVE ACTUALLY RETURNS THE VALUE THAT IS REMOVED> 
			int a = data.remove(0); //the remove method removes the element directly from the list
			
			temp.push(a);
			
			if (debug) {
				System.out.println(temp);
			}
		}
		
		return temp;
		
	}//end copyQueueToStack

} //end Tool4
