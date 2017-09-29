import java.util.Scanner;
// save to play around with how the input is working with new lines


public class FortuneTeller2 {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//getUserInfo();
	}
	
	public static void getUserInfo() {
	
		// data input by the user
		String fName;
		String lName;
		int age;
		int birthMonth;
		int nbrSiblings;
		String favColor;
		
		Scanner input;
		
		input = new Scanner(System.in);
		
		System.out.println("Greetings!  We are here to tell your fortune!");
		System.out.println("First, we will need to ask you for some information. " 
		+ "(If at any time you want to end the program, enter \"quit\")\n");
		
		System.out.println("What is your first name?");
		fName = input.nextLine();
		
		System.out.println("What is your last name?");
		lName = input.nextLine();
		
		System.out.println("What is your birth month? (Enter in MM (1-12) format)");
		birthMonth = input.nextInt();
		
		System.out.println("What is your age?");
		age = input.nextInt();
		
		System.out.println("How many siblings do you have?");
		nbrSiblings = input.nextInt();
		input.nextLine();
		
		System.out.println("Now, for the final question! What is your favorite ROYGBIV color? "
		+ "(Enter \"help\" to list the ROYGBIV colors)");
		favColor = input.nextLine();
		
	
	}
	
	public static void checkForQuit(String userInput) {
		
		// if the user enters "quit" for any question, stop running.
		if (userInput.equals("quit")) {
			System.exit(0);
		}
	}
}
