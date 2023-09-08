import java.util.Scanner;

public class TakingInputs2 {
	
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Prompt the user to enter their height
        System.out.print("Enter your height (in cm): ");
        double height = scanner.nextDouble();

        // Close the Scanner to release system resources
        scanner.close();

        // Display the user's information
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height (cm): " + height);
    }
}
