
import java.util.Arrays;

public class MultiDimensionalArrayExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		print2DArray(a,true);
	}
	
	public static void print2DArray(int[][] a, boolean rowMajor) {
		
		if (rowMajor) {	
			for (int r = 0; r < a.length; r = r + 1) 
				System.out.println(Arrays.toString(a[r]));
		}
		else {
			for (int c = 0; c < a[0].length; c = c + 1) 
				for (int r = 0; r < a.length; r = r + 1) 
					System.out.println(a[r][c]);
		}
	
	}

}




