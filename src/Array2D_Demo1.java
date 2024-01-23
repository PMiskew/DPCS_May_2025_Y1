
public class Array2D_Demo1 {

	public static void main(String[] args) {
		
		int[][] demo = new int[5][6];
		
		int[][] a = { 	
						{1,2,3},
						{4,5,6}
					};
					
		int[][] b = null;
		
		print2DArray(b,true);
		print2DArray(a,true);
		
	}
	

	public static void print2DArray(int[][] a, boolean b) {
	
		if (a == null) {
			return;
		}
		
		//If I want to print out a single row 
		
		for (int r = 0; r < a.length; r = r + 1) { //outside loop goes through the rows
		
			for (int c = 0; c < a[0].length; c = c + 1) { //inside loop goes through the columns
				
				System.out.println(a[r][c]);
			
			}
			
		}
	
		
	}
}
