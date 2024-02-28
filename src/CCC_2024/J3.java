

import java.util.Arrays;
import java.util.Scanner;

public class J3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] scores = {70,62,58,73}; //test 1
		//int[] scores = {75,70,60,70,70,60,75,70};
		int[] scores = {8,75,70,60,70,70,60,75,70};
		
		
		//int[] scores = {1,2,3};
		
		
		//Contest Input setup
		
/*
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int[] scores = new int[num];
		
		for (int i = 0; i < 4; i = i + 1) {
			scores[i] = s.nextInt();
		}
		
*/
		Arrays.sort(scores);
		
		//System.out.println(Arrays.toString(scores));
		
		int shrink = 1;
		int value = scores[scores.length - 1];
		int count = 0;
		
		for (int j = scores.length - 1; j >=0 && shrink < 4; j = j - 1) {
		
			if (scores[j] < value) {
				
				shrink = shrink + 1;
				if (shrink == 4)
					break;
				
				value = scores[j];
				
			}
			
			if (shrink == 3) {
				count = count + 1;
			}
			
			
		}
		
		System.out.println(value + " " + count);
		
		
	}

}
