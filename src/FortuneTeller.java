import java.util.Scanner;

public class FortuneTeller {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getUserInfo();
	}
	
	public static void getUserInfo() {
	
		// data input by the user
		String fName;
		String lName;
		String strAge;
		String birthMonth;
		String nbrSiblings;
		String favColor;
		
		Scanner input;
		
		input = new Scanner(System.in);
		
		System.out.println("Greetings!  We are here to tell your fortune!");
		System.out.println("First, we will need to ask you for some information. " 
		+ "(If at any time you want to end the program, enter \"quit\")\n");
		
		System.out.println("What is your first name?");
		fName = input.nextLine();
		checkForQuit(fName);
		
		System.out.println("What is your last name?");
		lName = input.nextLine();
		checkForQuit(lName);

		System.out.println("What is your age?");
		strAge = input.nextLine();
		checkForQuit(strAge);
		
		System.out.println("What is your birth month? (Enter in MM (1-12) format)");
		birthMonth = input.nextLine();
		checkForQuit(birthMonth);
		
		System.out.println("What is your favorite ROYGBIV color? "
		+ "(Enter \"help\" to list the ROYGBIV colors)");
		favColor = input.nextLine();
		checkForQuit(favColor);
	
		System.out.println("Now, for the final question! How many siblings do you have?");
		nbrSiblings = input.nextLine();
		checkForQuit(nbrSiblings);
		
		Integer age = Integer.parseInt(strAge);
		
		int nbrYrsTillRetire = findYearsTillRetire(age.intValue());
	}
	
	public static void checkForQuit(String userInput) {
		
		// if the user enters "quit" for any question, stop running.
		if (userInput.equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
	}
	
	public static int findYearsTillRetire(int age) {
	
		// The requirements state that if the age is even, we need one result 
		// for years to retire, and if it is odd, we need a different result
		
			
		if (age%2 == 0) {
			System.out.println("age is " + age + " remainder 0" + " 10 years till retirement");
			return 10;
		}
		else{
			System.out.println("age is " + age + " remainder 1 " + "15 years till retirement");
			return 15;
		}
		
	}
}
