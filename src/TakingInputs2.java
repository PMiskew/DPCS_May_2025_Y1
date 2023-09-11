import java.util.Scanner;

public class TakingInputs2 {
	
	/*
	 * Fact: 
	 * - This program takes user input for name, age and height. 
	 * - It uses the Scanner Class to take input 
	 * 		What is a Class:
	 * 			- A CLASS is a blue print for an OBJECT
	 * 
	 * Question:
	 * 
	 */
	
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
    	
    	//We are creating and instantiating a Scanner Object
    	//Reference type is Scanner = Object Type is Scanner
    	//System.in tells us the input is from the keyboard. 
    	//We name the Scanner scanner 
        Scanner scanner = new Scanner(System.in); 
        
        //When we declare a variable the first time we must indicate Type and we must
        //initialize it to something. 
        int age = 0; //declare and initalize variables at the top of a method. 
        String name = "";
        double height = 0;

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        //In the human code they use .next() to get strings not .nextLine()
        //Both of these methods take input from the computer and return as a string 
        //nextLine() will inlude space.s 
        name = scanner.nextLine();

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Prompt the user to enter their height
        System.out.print("Enter your height (in cm): ");
        height = scanner.nextDouble();

        // Close the Scanner to release system resources
        scanner.close();

        // Display the user's information
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height (cm): " + height);
    }
}
