import java.util.Scanner;
import java.util.Stack;

public class InfiniteLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		Stack<String> stack = new Stack<String>();
		String word = s.nextLine();
		
		//A while loop works like an if statment.  When we first reach it we check if condition is 
		//true.  If true then enter code block.  If false skip code block. 
		while (!word.equals("exit")) {
			//Code block
			stack.push(word);
			System.out.println("pushing");
			word = s.nextLine();
			//What makes a while loop different than an if statement is we check the condition again at the
			//end of the loop - If true go back and run code block again.  If false skip it. 
			
		}//check condition again
	}

}
