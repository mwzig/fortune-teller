import java.util.Scanner;

public class FortuneTeller {

	// user input data
	private String fName;
	private String lName;
	private String strAge;
	private String strBirthMonth;
	private String strNbrSiblings;
	private String favColor;

	// values calculated from determining fortune
	private int nbrYrsTillRetire;
	private String vacaHomeLoc;
	private String modeOfTransport;
	private int bankBal;

	public static void main(String[] args) {

		FortuneTeller fortuneTeller = new FortuneTeller();
		fortuneTeller.tellFortune();
	}

	public void tellFortune() {

		// First, get data we need from the user in order to determine his/her future.
		getUserInput();
		// Next, determine the fortune based on the input.
		determineFortune();
		// Next, print the user's fortune to the console.
		printFortune();

	}

	// **************************************************************************************************//
	// This method gets data we need from the user in order to determine his/her
	// future.
	// **************************************************************************************************//
	private void getUserInput() {

		Scanner input = new Scanner(System.in);

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
		strBirthMonth = input.nextLine();
		checkForQuit(strBirthMonth);

		System.out.println("What is your favorite ROYGBIV color? " + "(Enter \"help\" to list the ROYGBIV colors)");
		favColor = input.nextLine();
		while (favColor.toLowerCase().equals("help")) {
			System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet.");
			favColor = input.nextLine();
			checkForQuit(favColor);
		}
		checkForQuit(favColor);

		System.out.println("Now, for the final question! How many siblings do you have?");
		strNbrSiblings = input.nextLine();
		checkForQuit(strNbrSiblings);

	}

	// **************************************************************************************************//
	// this method checks to see if the user has entered "quit", and if so, prints a
	// message and exits the program
	// **************************************************************************************************//
	public static void checkForQuit(String userInput) {

		// if the user enters "quit" for any question, stop running.
		if (userInput.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
	}

	// **************************************************************************************************//
	// This method determines the fortune based on the user input //
	// **************************************************************************************************//
	private void determineFortune() {

		Integer age = Integer.parseInt(strAge);
		Integer birthMonth = Integer.parseInt(strBirthMonth);
		Integer nbrSiblings = Integer.parseInt(strNbrSiblings);

		// woohoo!  Because of autoboxing, we can pass an Integer object to a method
		// that is expecting an int!
		nbrYrsTillRetire = findYearsTillRetire(age);
		vacaHomeLoc = findVacaHomeLocation(nbrSiblings);
		modeOfTransport = findModeOfTransport(favColor);
		bankBal = findBankBalance(birthMonth);

	}

	// **************************************************************************************************//
	// This method prints the fortune to the console.                                                    //
	// **************************************************************************************************//
	private void printFortune() {

		System.out.println(fName + " " + lName + " will retire in " + nbrYrsTillRetire + " years with $" + bankBal
				+ " in the bank, a vacation home in " + vacaHomeLoc + ", and travel by " + modeOfTransport + ".");
	}


	// **************************************************************************************************//
	// The requirements state that if the age is even, we need one result
	// for years to retire, and if it is odd, we need a different result
	// **************************************************************************************************//
	private int findYearsTillRetire(int age) {
	
		if (age % 2 == 0) {
			System.out.println("age is " + age + " remainder 0" + " 10 years till retirement");
			return 10;
		} else {
			System.out.println("age is " + age + " remainder 1 " + "15 years till retirement");
			return 15;
		}
	}

	// **************************************************************************************************//
	// Determine the vacation home location based on the user's number of siblings
	// **************************************************************************************************//
	private String findVacaHomeLocation(int nbrSiblings) {

		String vacaHomeLoc = "";

		if (nbrSiblings == 0) {
			System.out.println("0 siblings, loc is Florida");
			vacaHomeLoc = "Orland, FL";
		} else if (nbrSiblings == 1) {
			System.out.println("1 sibling, loc is Idaho");
			vacaHomeLoc = "Boise, Id";
		} else if (nbrSiblings == 2) {
			System.out.println("2 siblings, loc is Dallas, TX");
			vacaHomeLoc = "Dallas, TX";
		} else if (nbrSiblings == 3) {
			System.out.println("3 siblings, loc is Phoenix, AZ");
			vacaHomeLoc = "Phoenix, AZ";
		} else if (nbrSiblings > 3) {
			System.out.println(">3 Siblings, loc is Demoines, IA");
			vacaHomeLoc = "Demoines, IA";
		} else if (nbrSiblings < 0) {
			System.out.println("0 Siblings!!! What????");
			vacaHomeLoc = "Meridian, MS";
		}

		return vacaHomeLoc;
	}

	// **************************************************************************************************//
	// Determine the vacation home location based on the user's number of siblings
	// **************************************************************************************************//
	private String findModeOfTransport(String favColor) {

		// Determine the vacation home location based on the user's number of siblings
		String modeOfTransport = "";

		switch (favColor.toLowerCase()) {
		case "red":
			modeOfTransport = "VW Bug";
			break;
		case "orange":
			modeOfTransport = "VW Passat";
			break;
		case "yellow":
			modeOfTransport = "Honda minivan";
			break;
		case "green":
			modeOfTransport = "Honda Accord";
			break;
		case "blue":
			modeOfTransport = "Honda Fit";
			break;
		case "indigo":
			modeOfTransport = "Honda Civic";
			break;
		case "violet":
			modeOfTransport = "Honda CRV";
			break;
		default:
			modeOfTransport = "Horse and Buggy";
		}
		System.out.println("fav color is " + favColor + " mode of transport is " + modeOfTransport);
		return modeOfTransport;
	}

	// **************************************************************************************************//
	// Determine the bank balance based on the user's birthday month
	// **************************************************************************************************//
	private int findBankBalance(int birthMonth) {

		int bankBal = 0;

		if (birthMonth >= 1 && birthMonth <= 4) {
			System.out.println("birth month 1-4");
			bankBal = 400000;
		} else if (birthMonth > 4 && birthMonth <= 8) {
			System.out.println("birth month 5-8");
			bankBal = 800000;
		} else if (birthMonth > 8 && birthMonth <= 12) {
			System.out.println("birth month 9-12");
			bankBal = 1200000;
		} else {
			System.out.println("something besides 1-12 entered for birth month");
			bankBal = 0;
		}

		System.out.println("the bank balance is " + bankBal);
		return bankBal;
	}

}
