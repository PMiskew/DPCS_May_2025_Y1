import java.util.Stack;

public class StackExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Take the Example 2 from the one pager and execute the code here.
		//With this we assume there is a stack called M that contains double. 
		//Using the same approach as example 1 first create a randomized stack called m
		
		//Step 1: Declare and initialize all variables
		int count = 0;
		//watch the type since the stack holds doubles.
		double sum = 0;
		double average = 0;
		
		Stack<Double> m = new Stack<Double>();
		
		//Step 2: Populate m with random values
		//We could totally find the average here, but the point of this lesson
		//is to understand how to loop through a stack 
		for (int i = 0; i < (int)(Math.random()*100); i = i + 1) { //A
			
			//The scope of this t is between A braces
			double t = Math.random();
			m.push(t);
			
		} //A
		 
	
		//Step 3: loop through m and find sum and count the number of elements. Note that 
		//			the IB does not have a built in length method for stacks. 
		while (m.isEmpty() == false) { //B
			
			//Question: Why do I declare t again? 
			//The SCOPE of this t is between B braces
			double t = m.pop();
			sum = sum + t;
			count = count + 1;
			
			
		} //B
		
	
		//Step 4: Calculate the average
		average = sum / count; 
		
		
		//Step 5: Using an if statement output if appropriate. 
		
		if (average < 0.5) {
			System.out.println(average);
		}
		
		
		
		
		
	}

}
