import java.util.ArrayList;

/*
 * 
 * We are going to use this code to help understand some ideas around speed and memory 
 * allocation.  Also it will show you how to calculate run time of your core tools. 
 * 
 */
public class Tool6 {

  
	public static void main(String[] args) {
		
		/*
		 * Note: I have added currentTimeMills to measure the total running time
		 * of each situation
		 */
		
		double startA = System.currentTimeMillis();
		System.out.println(isPrimeA(174764));
		double endA = System.currentTimeMillis();
		double totalTimeA = endA - startA;
		System.out.println(totalTimeA);
		
		double startB = System.currentTimeMillis();
		System.out.println(isPrimeB(174764));
		double endB = System.currentTimeMillis();
		double totalTimeB = endB - startB;
		System.out.println(totalTimeB);
		
		double startC = System.currentTimeMillis();
		System.out.println(isPrimeC(174764));
		double endC = System.currentTimeMillis();
		double totalTimeC = endC - startC;
		System.out.println(totalTimeC);
	}
	public static boolean isPrimeA(int a) {
		
		

		for (int i = 2; i < a; i = i + 1) {
		
			if (a % i == 0) {
			
				return false;
			
			}
		
		}

	
		return true;
		
	}
	
	public static boolean isPrimeB(int a) {
		
		ArrayList<Integer> list = getFactorListA(a);

		if(list.size() == 2) {
		
			return true;
		
		}


		return false;
		

	}
	
	public static boolean isPrimeC(int a) {
		
		ArrayList<Integer> list = getFactorListB(a);

		if(list.size() == 2) {
	
			return true;
		
		}
				
		return false;
		

	}


	
	
	public static ArrayList<Integer> getFactorListA(int a) {
		
		ArrayList<Integer> data = new ArrayList<Integer>();
		
		for (int i = 1; i <= a; i = i + 1) {
			data.add(i);
		}
		
		for (int i = data.size() - 1; i >= 0; i = i - 1) {
			
			int temp = data.get(i);
			
			if (a%temp != 0) {
				data.remove(i);
			}
		}
		
		return data;
		
	}
	
	public static ArrayList<Integer> getFactorListB(int a) {
		
		ArrayList<Integer> data = new ArrayList<Integer>();
		
		for (int i = 1; i <= a; i = i + 1) {
			
			if (a%i == 0) {
				data.add(i);
			}
		}
		
		return data;
	}
}