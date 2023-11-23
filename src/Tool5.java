import java.util.ArrayList;

public class Tool5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a1 = getFactorList(9);
		System.out.println(a1);
		
	}
	
	public static ArrayList<Integer> getFactorList(int a) {
		
		
		ArrayList<Integer> data = new ArrayList<Integer>();
		
		/*
		 * while loops and do while are called Conditional loops
		 * 
		 * for loops are called Counted loops
		 *
		 * Conditional and counted loops are completely interchangeable. 
		 * By thinking out the situation you can significantly simplify
		 * your code. 
		 * 
		 * If you go into the loop knowing in advance how many times it will
		 * run a COUNTED LOOP is better.  For exmaple looping through a data
		 * structure. 
		 * 
		 * If you are going to be asking a question or running something where
		 * you DO NOT know how many times it will take, for example taking user 
		 * input, a conditional loop is better. 
		 * 	
		 */
		
		
		for (int i = 1; i <= a; i = i + 1) {
			data.add(i);
		}
		
		//LOGIC ERROR: Approach 1
		/*
		 
		for (int i = 1; i < data.size(); i = i + 1) {
			
			int temp = data.get(i);
			
			if (a % temp != 0) {
				data.remove(i);
			}
		}
		
		*/
		
		//WORKS: Approach 2
		/*
		for (int i = 1; i < data.size(); i = i + 1) {
			
			int temp = data.get(i);
			
			if (a % temp != 0) {
				data.remove(i);
				i = i - 1;
			}
		}
		*/
		
		//WORKS: Approach 3 (Best practice) - When removing elements from a list always loop in reverse
		for (int i = data.size() - 1; i >= 0; i = i - 1) {
			
			int temp = data.get(i);
			
			if (a%temp != 0) {
				data.remove(i);
			}
		}
		
		
		return data;
		
		
		
	}
	
	public static ArrayList<Integer> mB(int a) {
		
		return null;
	}

}
