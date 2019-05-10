import java.util.Scanner;

public class User {

//Instance Variables
static String Number = "";
	
	public static void main(String[] args) {
		
		//Instantiating a Class within an object
		Clientlogin clientlogin = new Clientlogin();	
		Mangerlogin managerlogin = new Mangerlogin();	
	
		System.out.println("Welcome to the Hotel Management System");
		System.out.println("\n" + "If you're a client and wish to log in, press 1, if you're the Manager and wish to log in, press 2. If you wish to view bookings press three. Any of charcter entered will end the program");
		
		//The variable "Number" will contain the string entered using the scanner "Enternum"
		Scanner Enternum = new Scanner(System.in);
		Number = Enternum.nextLine(); 	
	
		//If the user enters 1, it will load the function "clientlogin" from the Clientlogin Class
		if (Number.equals("1")){
			clientlogin.clientlogin();
		}
	
		//If the user enters 2, it will load the function "managerlogin" from the Managerlogin Class
		else if (Number.equals("2")) {
			managerlogin.managerlogin();		
		}
	
		else if (Number.equals("3")) {

		}

		//Default Case- If the user enters none of the three numbers, the program will terminate
		else {
			System.out.println("Program terminated");
			System.exit(0);
		}

	}
	

}
