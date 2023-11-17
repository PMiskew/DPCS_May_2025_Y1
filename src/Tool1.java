/*
 * 
 * I recommend you make each method in a new class then combine
 * before submission.  This makes it a lot easier to debug. 
 * 
 */
public class Tool1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TEST findSum");
		int[] nums1 = {1,2,5,3,5}; // sum = 16 
		int[] nums2 ={1,1,1,1,1}; //sum = 5
		int[] nums3 = {};// sum = 0;
		int[] num4 = {99}; //sum = 99
		
	} //end main method
	
	
	/**
	 * This method takes an array of integers and returns the
	 * sum
	 * @param a
	 * @return
	 */
	public static int findSum(int[] a) {
		
		/*
		 *      0 1 2
		 * a = [1,2,3]
		 * 
		 */
		
		
		//Step 1: Create a variable called sum and set it equal to 0
		int sum = 0;
				
		//Step 2: Write a loop to go through every element in the array a
		for (int i = 0; i < a.length; i = i + 1) {
			
			//Step 3: add a[i] to the sum
			sum = sum + a[i]; 
			
		} //end for loop
		
		return sum;
				
	}//end findSum
 

} //end of the class - nothing goes beyond this braket
