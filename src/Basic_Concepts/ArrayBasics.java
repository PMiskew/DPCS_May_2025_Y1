package Basic_Concepts;

public class ArrayBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * An array is a group of elements and there two things we
		 * always want to know about an array.  These are
		 * 
		 * length: 
		 * 		How many elements are in the array
		 * index values: 
		 * 		These are used to access each element - The index is always
		 * 		one less than the length
		 * 
		 * int[] nums = {45,23,12}; 
		 * 
		 * nums has a length of 3 with index values 0,1,2
		 * 
		 * 
		 */
		
		//			   0  1  2
		int[] nums = {45,23,12};

		//Best Practice: Always grab the length of the array using the build in value
		//for length; This is used in all sorts of ways, specifically with loops and 
		//checking elements. Generally speaking if you are ever checking the last element
		//you NEVER use the actual index - use length - 1
		int l_nums = nums.length; 	
		
		
		//We can access individual elements using the "at" notation
		
		/*
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]); //bad practice
		System.out.println(nums[l_nums - 1]); //better
		System.out.println(nums[nums.length - 1]);
		*/
		//bread and butter algorithm:
		/*
		 * A ) Print out all the elements
		 * B) Find the sum of the elements in the array
		 * C) Find the sum of the odd values in the array
		 * D)Find the sum of the even values in the array
		 * Print every second element in the array
		 */
		
		/*
		 * To loop through any array we use a FOR loop
		 */
		
		//SOLUTION: A
		//	count; check; change
		for (int i = 0; i < nums.length; i = i + 1) {
			System.out.println(nums[i]);
		}
		
		/*
		 * 	int[] nums = {45,23,12};
		 *   i  |  i < 3 	| print out
		 *   0  |  0 < 3 T  | RUN LOOP print nums[0] --> 45
		 *   1  |  1 < 3 T  | RUN LOOP print nums[1] --> 23
		 *   2  |  2 < 3 T  | RUN LOOP print nums[2] --> 12
		 *   3  |  3 < 3 F  | EXIT LOOP
		 */
		
		
		//B) 
		System.out.println("********************************");
		System.out.println("FIND SUM SOLUTION: ");
		int sum = 0;
		for (int i = 0; i < nums.length; i = i + 1) {
			
			sum = sum + nums[i];

		}

		System.out.println(sum);
		
		
		
		//C) 
		System.out.println("********************************");
		System.out.println("FIND SUM OF ODD VALUES: ");
		sum = 0;
		for (int i = 0; i < nums.length; i = i + 1) {
			
			if (nums[i] % 2 == 1) {
				sum = sum + nums[i];
			}
		}
		
		System.out.println(sum);
		
		//D) 
		System.out.println("********************************");
		System.out.println("FIND SUM OF EVEN VALUES: ");
		sum = 0;
		for (int i = 0; i < nums.length; i = i + 1) {
			//MOD gives the remainder when we divide 
			if (nums[i] % 2 == 0) {
				sum = sum + nums[i];
			}
		}
		
		System.out.println(sum);
		
		//E) Finding the largest value
		
	}

}
