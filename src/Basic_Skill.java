//imports the scanner class and lets me use it
import java.util.Scanner;

public class Basic_Skill {

	public static void main(String[] args) {

		
		//The input Scanner object lets me use 
		//methods that can take inputs from the user
		Scanner input = new Scanner(System.in);
		
		//Declare and initialize all the variables at the 
		//top of the program. 
		String name = "";
		int age = 0;
		double mark1 = 0;
		double mark2 = 0;
		double mark3 = 0;
		
		//Take an input for the name
		System.out.print("What is your name: ");
		//an assignment statement
		name = input.nextLine();
		
		//Take input for age
		System.out.print("How old are you: ");
		age = input.nextInt();
		
		//Take input for marks
		System.out.print("What is the first mark: ");
		mark1 = input.nextDouble();
		
		System.out.print("What is the second mark: ");
		mark2 = input.nextDouble();
		
		System.out.print("What is the thrid mark: ");
		mark3 = input.nextDouble();
		
		
		System.out.println("**********************************************");
		System.out.println("Marks for "+name);
		System.out.println("English: "+mark1);
		System.out.println("   Math: "+mark2);
		System.out.println("Science: "+mark3);
		
		
		
		
		
		
		
		
		
		System.out.println("END PROGRAM");
		
		
		
		
		
		
		
		
		
		
		

	}

}
