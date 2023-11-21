
public class Tool3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * Returns true if a is a perfect square and false otherwise
	 * @param a
	 * @return
	 */
	public static boolean isPerfectSquare(int a) {
		
		return true;
	}
	
	/**
	 * This method takes an array of integers as parameters and reverses
	 * the position of all elements.  For example if a = {1,2,3} 
	 * then at the end of the method the passed array will be {3,2,1}
	 * 
	 * PostCondition: the passed array is modified to be reveresed
	 * @param a
	 */
	public static void reverseArray(int[] a) {
		
	}
	
	public static char getHexDigit(String a) {
		
		String[] values = {"0000","0001","0010"};
		char[] hex = {'0','1','2'};
		
		for (int i = 0; i < values.length; i = i + 1) {
			
			if (values[i].equals((a))) {
				return hex[i];
			}
		}
		return -1;
	}
	
	public static String base2ToHex(int a) {
		
		char a = getHexDigit(""+a);
	}
	
	

}
