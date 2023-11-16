
public class ToolDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(addDigitsA(123)); //expect 6
		System.out.println(addDigitsA(0)); //expect 0
		System.out.println(addDigitsA(1)); //expect 1
		System.out.println(addDigitsA(-1)); //expect 1
		System.out.println(addDigitsA(-11)); //expect 2
	}
	
	/**
	 * This method take an integer as a parameter and returns teh sum of hte digits. 
	 * 
	 * @param num
	 * @return
	 */
	
	public static int addDigitsA(int num) {
		
		/*
		 * Approach 1: We are going to use the mod10 div 10 algorithm
		 * 
		 *  when I mod a number by 10 I always get the units digit
		 *  
		 *  12 % 10 = 2
		 *  
		 *  when I integer divide by 10 I chop off the units digit
		 *  
		 *  12 div 10 = 1
		 *  19 div 10 = 1
		 *  12493 div 10 = 1249
		 *  
		 *  loop while num > 0 
		 *  	temp = num % 10
		 *  	sum = sum + temp
		 *  	num = num div 10
		 *  
		 */
		
		/*
		 * 
		 * num = 123
		 * 
		 * sum | num > 0 | sum       |  num
		 *  0  | T       | 3         | 12
		 *     | T       | 3 + 2 = 5 | 1
		 *     | T       | 5 + 1 = 6 | 0
		 *     | F       | return 6
		 */
		
		int sum = 0;
		
		/*
		if (num < 0) {
			num = num * -1;
			
		}
		*/
		
		//num = Math.abs(num);
		
		num = (int)Math.sqrt(num * num);
		
		while (num > 0) {
			
			int temp = num % 10;
			sum = sum + temp;
			num = num / 10; //THIS IS INTEGER DIVISION BECAUSE num is an int and 10 is an int
			
		}
		return sum;
	}
	
	
	public static int addDigitsB(int num) {
		
		String snum = "" + num;  
		int sum = 0;
		
		for (int i =0 ; i < snum.length(); i = i + 1) {
			
			int temp = Integer.parseInt("" + snum.charAt(i));
			sum = sum + temp;
		}
		return sum;
	}
	
	public static int addDigitsC(int num) {
		
		//Step 1: Covert the number into an array where each element is a digit
		//Step 2: They add all the elements in the array;
		//Step 3: They return the sum
		
	}
	
	

}
