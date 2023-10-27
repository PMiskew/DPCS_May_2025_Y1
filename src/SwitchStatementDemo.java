import java.util.Scanner;

public class SwitchStatementDemo {

	public static void main(String[] args) {

		/*
		 * A switch statement is used when we have a variety 
		 * of choices that we can make and want hte program 
		 * to execute.  It is often used when we have a menu
		 * 
		 */
		
	
	
	Scanner s1 = new Scanner(System.in);
	Scanner s2 = new Scanner(System.in);
	int option = 0;
	String again = "";
	
	do {
		
		System.out.println("GAME 1");
		
		System.out.println("1: option 1");
		System.out.println("2: option 2");
		System.out.println("3: option 3");

		
		//We have two condidtional loops in Java
		//	while loop
		//	do while loop
		
		//When do you use which? 
		// 	If you do not know in advance how many times a user
		//	will enter an input then a CONDITIONAL loop is best.
		
		//	If you know the question has to be asked at least once
		// 	use a do while loop
		//	A do while loop will ALWAYS RUN ONCE!!!!
		
		option = 0;
		
		do {
			
			
			System.out.print("Choose Option: ");
			option = s1.nextInt();
			
			if (option < 1 || option > 3) {
				System.out.println("INVALID INPUT");
			}
			
		} while (option < 1 || option > 3);
		
		switch (option) {
			case 1:
				System.out.println("Case 1");
				break;
			case 2:
				System.out.println("Case 2");
				break;
			case 3:
				System.out.println("Case 3");
				break;
		} //end switch
		
		
		//Question: Isn't a switch statement like a else if
		//Answer: 	Totally, but there are fun ways we use this
		//			structure to our advantage.
		
		
		System.out.println("Thank you for take our survey.");
		System.out.println("How many questions can you answer?");
		System.out.println("1: All questions");
		System.out.println("2: Some questions");
		System.out.println("3: One question");
		System.out.print("Choose Option: ");
		option = s1.nextInt();
		
		String food = "";
		String movie = "";
		String sport = "";
		
		switch (option) {
			
			case 1: 
				System.out.println("What is your favourite food?");
				food = s2.nextLine();
			case 2:
				System.out.println("What is your favourite movie?");
				movie = s2.nextLine();
			case 3: 
				System.out.println("What is your favourite sport?");
				sport = s2.nextLine();
				
		}
		
		System.out.print("Woudl you like to play agian: ");
		again = s2.nextLine();
		
	//The loop will repeat if the while statement is true!
	/*
	 * A very common error is to write the below statement in the while loop
	 * 
	 * while (again == "yes");
	 * 
	 * For us this reads perfectly correct, but for Java you CANNOT compare strings with ==.  With strings you MUST use 
	 * .equals or .compareTo
	 * 
	 * what .compareTo does is it returns and integer values of 0 if the strings are equal 
	 */
	} while (again.equalsIgnoreCase("yes") == true);
		
		
		
	}

}
