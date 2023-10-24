import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ContinuousInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Pseudo Code
		 * 
		 * word = ""
		 * S = new Stack
		 * C = new Collection
		 * 
		 * while (word != "exit") 
		 * 		word = take input 
		 * 
		 * 		if (word != "exit")
		 * 			S.push(word)
		 * 			C.add(word)
		 * 		end if 
		 * 
		 * end while
		 */
		
		/*
		Scanner s = new Scanner(System.in);
		
		String word = "";
		Stack<String> stack = new Stack<String>();
		ArrayList<String> list = new ArrayList<String>(); //works like a generic collection or a list in python
		
		while (word.equals("exit") == false) {
			
			word = s.nextLine();
			
			if (word.equals("exit") == false) {
				stack.push(word);
				list.add(word);
			}
		}
		
		System.out.println(stack);
		System.out.println(list);
		//*/
		
		ArrayList<String> list = generateList();
		System.out.println(list);
		
		Stack<String> stack = generateStack();
		System.out.println(stack);
		
	}//end main
	
	
	
	
	
	//Create a method called generateList or generateStack that will continually as the user
	//for inputs and push/add them to the data structure.  The method should return the build
	//stack or list. 
	public static ArrayList<String> generateList() {
		
		Scanner s = new Scanner(System.in);
		
		String word = "";
		ArrayList<String> list = new ArrayList<String>(); //works like a generic collection or a list in python
		
		while (word.equals("exit") == false) {
			
			word = s.nextLine();
			
			if (word.equals("exit") == false) {
		
				list.add(word);
			}
		}
		
		
		
		return list;
	}
	
	public static Stack<String> generateStack() {
		
		Scanner s = new Scanner(System.in);
		
		String word = "";
		Stack<String> stack = new Stack<String>(); //works like a generic collection or a list in python
		
		while (word.equals("exit") == false) {
			
			word = s.nextLine();
			
			if (word.equals("exit") == false) {
		
				stack.add(word);
			}
		}
		
		
		
		return stack;
		
	}
	
	


}//end class
