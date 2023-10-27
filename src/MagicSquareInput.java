import java.util.Scanner;

public class MagicSquareInput {

	public static void main(String[] args) {
		
		Scanner s =  new Scanner(System.in);
		
		String[] nums = new String[16];
		
		for (int i = 0; i < 16; i = i + 1) {
			
			nums[i] = s.next();
			
		}
	}
}
