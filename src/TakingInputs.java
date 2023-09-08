import java.util.Scanner;

public class TakingInputs {
	
	//1. Take input for Strings
	//2. Take input for integers
	//3. Take input for characters
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	
		//Step 1: Declare each variable
		String name = "John"; //words or sentences
		int age = 0; //integer value
		double userHeight = 0; //decimal values positive or negative
		
		//Step 2: Prompt user and take inputs
		System.out.print("What is your name: ");
		name = s.next();
		System.out.print("What is your age: ");
		age = s.nextInt();
		System.out.print("What is your height: ");
		userHeight = s.nextDouble();
		
		System.out.println("Your name is "+name+". You are " + age + " years old.");
		System.out.println("You are " + userHeight + " cm tall.");
		
	}

}
