
public class FortuneTeller {

	String fName;
	String lName;
	int birthMonth;
	int age;
	int nbrSiblings;
	String favColor;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getUserInfo();
	}
	
	public static void getUserInfo() {
		
		System.out.println("Greetings!  We are here to tell your fortune!");
		System.out.println("First, we will need to ask you for some information. " 
		+ "(If at any time you want to end the program, enter \"quit\")\n");
		System.out.println("What is your first name?");
		System.out.println("What is your last name?");
		System.out.println("What is your birth month? (Enter in MM (1-12) format)");
		System.out.println("What is your age?");
		System.out.println("How many siblings do you have?");
		System.out.println("Now, for the final question! What is your favorite ROYGBIV color? "
		+ "(Enter \"help\" to list the ROYGBIV colors)");
	
	}
	

}
