import java.util.Scanner;

public class DrawRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
				
		System.out.print("What is the width: ");
		int width = s.nextInt();
		System.out.print("What is the height: ");
		int height = s.nextInt();
		
		/*
		 * 
		 *   w = 4
		 *   h = 5
		 *   
		 *   **** 
		 *   *  *
		 *   *  *
		 *   *  *
		 *   ****
		 *   
		 *   Step 1: Draw top line
		 *   
		 *   Step 2: Using loop draw midddle section
		 *   
		 *   Step 3: Draw bottom line
		 */
		
		
		for (int i = 0; i < width; i = i + 1) {
			System.out.print("*");
		}
		System.out.println();
		//Height is 5 we draw the top and bottom line, how many more lines are there to draw
		int mid = height - 2;
				
		for (int i = 0; i < mid; i = i + 1) {
			System.out.print("*");
			for (int j = 0; j < width - 2; j = j + 1) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println("");
		}
		
		
		for (int i = 0; i < width; i = i + 1) {
			System.out.print("*");
		}
	}

}
