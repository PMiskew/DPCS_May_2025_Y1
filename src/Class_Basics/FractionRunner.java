package Class_Basics;

import java.util.ArrayList;
import java.util.Arrays;

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
		
		
		ArrayList<Fraction> fractions = new ArrayList<Fraction>();
		
		for (int i = 0; i < 50; i = i + 1) {
			Fraction ftemp = new Fraction();
			fractions.add(ftemp);
		}
		
		
		Fraction[] array_References = new Fraction[10]; //edfaulted null
		Fraction[] array_Copies = new Fraction[10];
		
		int count = Math.min(fractions.size(),10);
		for (int i = 0; i < count; i = i + 1) {
		
			array_References[i] = fractions.get(i); //when I copy the fraction into the array from the list I am copying a reference - so there is only one fraction object
			array_Copies[i] = fractions.get(i).copyFraction(); //I make a whole new copy
		}
			
		System.out.println("List: \t\t\t"+fractions);
		System.out.println("Reference Array:\t"+Arrays.toString(array_References));
		System.out.println("Copy Array:\t\t"+Arrays.toString(array_Copies));
		
	
		
		System.out.println("********");
		
		array_References[0].setNum(99); //when I change array_Fraction[0] I am using the reference to find the fraction
		
		System.out.println("List: \t\t\t"+fractions);
		System.out.println("Reference Array:\t"+Arrays.toString(array_References));
		System.out.println("Copy Array:\t\t"+Arrays.toString(array_Copies));
		
		
		
	}
}