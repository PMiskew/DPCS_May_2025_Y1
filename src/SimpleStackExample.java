import java.util.Stack;

/**
 * Stacks are a data structure that only appears on 
 * the HL exam.  That said, SL students can easily 
 * engage with this topic and use it for their IA.
 * 
 * In addition, all of the idea we have been discussing
 * around reading code apply here.
 *   
 * Stacks conform to the First In Last Out (FILO) 
 * principle which mean that you cannot access things
 * as new elements are stacked on top.  
 * 
 * Think of a stack as a stack of books.  You can't get
 * the bottom book until you take all the ones on top. 
 * 
 * 
 * THE IB PSDEUDOCODE NOTATION
 * 
 * There are more method than this with Stacks, but 
 * this is what you can use on the IB exam.  All questions
 * are designed to be done with these methods.  
 * 
 * push(<ELEMENT>) - returns  ELEMENT pushed
 * pop() - returns ELEMENT on top of STACK
 * isEmpty() - return boolean
 * 
 * LINK TO IB REFERENCE
 * https://drive.google.com/drive/u/0/folders/1ZL7Ch-sHtZAGDL_ndWB1vUn3faBv2ksE
 * 
 * WHAT IS <ELEMENT>
 * 
 * This is how Java refers to Generic TYPE. At this stage take 
 * it to mean that it works with any type of object. 
 *
 */
public class SimpleStackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> words = new Stack<String>();
		System.out.println(words);
		
		words.push("cat");
		
		System.out.println(words);
		
		String x = words.push("dog");
		words.push("fish");
		words.push("monkey");
		words.push("frog");
		
		System.out.println(words);
		
		//bread and butter algorithm
		while (words.isEmpty() == false) {
			String top = words.pop();
			System.out.println(words);
		}
		
		
		
		
		
		
	}

}



















