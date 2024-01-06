package Class_Basics;

public class FractionRunner {
	
	public static void main(String[] args) {
	
		//General --> specific
		Object o1 = new Fraction();
		
		Fraction f1 = new Fraction(3,4);
		
		//We have the 
		//	implied object - f2
		//	passed object - f2
		Fraction f2 = new Fraction(1,2);
		
		
		Fraction f3 = f1.findLarger(f2);
		
		//checking if reference are the same
		if (f1 == f3) {
			System.out.println("A");
		}
		
		
		Fraction f4 = f2.copyLarger(f1);
		
		//checking if fraction is the same
		if (f1.equals(f4)) {
			System.out.println("B");
		}
		
		
	}
}