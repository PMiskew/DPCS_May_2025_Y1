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
		int[] nums4 = {99}; //sum = 99
		
		System.out.println(findSum(nums1));
		System.out.println(findSum(nums2));
		System.out.println(findSum(nums3));
		System.out.println(findSum(nums4));
	
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
	
	//Homework:  I want you to start creating your modsum methods
	/*
	 * A modSum method is one that find the sum of an array of integers
	 * (or some other structur), but modifies the approach
	 * 
	 * public static int findSumOfEven(int[] a) {
	 * 
	 * }
	 * 
	 */
 
	/**
	 * 
	 * @param a
	 * @return
	 */
	public static int findSumOfEven(int[] a) {
		 
		int sum = 0; 
		
		for (int i = 0; i < a.length; i = i + 1) {
			
			if (a[i] % 2 == 0) {
				sum = sum + a[i];
			}
		}
		
		return sum;
	}
	
	/**
	 * 
	 * @param a
	 * @return
	 */
	public static int findSumOfOdd(int [] a) {
		
		int sum = 0; 
		
		for (int i = 0; i < a.length; i = i + 1) {
			
			if (a[i] % 2 != 0) {
				sum = sum + a[i];
			}
		}
		
		return sum;
	}
	
	/**
	 * This returns the sum of integers starting at index 0 add 
	 * num integers.  For example if a = {1,2,3,4,5} and num = 2
	 * then the method would add the first 2 elements. 
	 * @param a
	 * @param num
	 * @return
	 */
	public static int findSumOfNValues(int[] a, int num) {
		
		int sum = 0; 
		
		for (int i = 0; i < a.length; i = i + 1) {
			
			if (a[i] % 2 != 0) {
				sum = sum + a[i];
			}
		}
		
		return sum;
		
		
	}

} //end of the class - nothing goes beyond this braket
