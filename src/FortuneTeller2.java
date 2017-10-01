import java.util.Scanner;

//********************************************************************************************
//* Saved this - it shows how to get some of the input as integers and 
//* some as strings.  There is a weirdness to getting an integer
//* followed by getting a string.  
//* When inputting data, you have to type in the integer and then hit enter so
//* that the program knows you have finished entering the input.
//* The nextInt() method just gets the integer. (But there is that enter (newline/CR) still out
//* there.   The program's nextLine() then picks up that newline and thinks that is the  
//* input for the nextLine(), and since it is a newline/CR, it thinks the data is finished 
//* (with basically nothing entered).  To fix this, you have to add an extra nextLine()
//* after a nextInt that is followed by a nextLine.
//********************************************************************************************

public class FortuneTeller2 {

	private String fName;
	private String lName;
	private int age;
	private int birthMonth;
	private int nbrSiblings;
	private String favColor;

	public static void main(String[] args) {

		FortuneTeller2 fortTell2 = new FortuneTeller2();
		fortTell2.getUserInfo();
	}

	// get data from the user
	public void getUserInfo() {

		Scanner input = new Scanner(System.in);

		System.out.println("Greetings!  We are here to tell your fortune!");
		System.out.println("First, we will need to ask you for some information. "
				+ "(If at any time you want to end the program, enter \"quit\")\n");

		System.out.println("What is your first name?");
		fName = input.nextLine();

		System.out.println("What is your last name?");
		lName = input.nextLine();

		System.out.println("What is your age?");
		age = input.nextInt();

		System.out.println("What is your birth month? (Enter in MM (1-12) format)");
		birthMonth = input.nextInt();

		// add a nextLine() here because we are following a nextInt() with a nextLine()
		// and if we don't do this, we will just pick up the /n after the integer as the
		// value for the nextLine().
		input.nextLine();

		System.out.println("What is your favorite ROYGBIV color? " + "(Enter \"help\" to list the ROYGBIV colors)");
		favColor = input.nextLine();

		System.out.println("Now, for the final question! How many siblings do you have?");
		nbrSiblings = input.nextInt();
		input.nextLine();

		System.out.println(" The user's name is " + fName + " " + lName + ".");
		System.out.println("Their age is " + age + ", birth month is " + birthMonth + ", favorite color is " + favColor
				+ ", and number of siblings is " + nbrSiblings + ".");

	}

	// we'll use this soon!
	public static void checkForQuit(String userInput) {

		// if the user enters "quit" for any question, stop running.
		if (userInput.equals("quit")) {
			System.exit(0);
		}
	}
}
