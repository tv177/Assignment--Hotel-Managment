import java.util.Scanner;

public class Client extends User {

//Instance Variables
static String num = "";		
static String numguests = "";		
static String bookingdate = "";	
static String booked = "";


	public void clientwelcome(){	
		
		System.out.println("\n" + "Welcome Clients! Press 1 if you would like to do your booking. Press 2 if you want to manage your booking. Press any other character to go back.");	
	
		//The variable "Num" will contain the string entered using the scanner "Enternum"
		Scanner Enternum = new Scanner(System.in);
		num = Enternum.nextLine(); 	
	
		if (num.equals("1")) {
			
			System.out.println("How many guests are staying with you?- Max 5"); 	
			Scanner Enternumguests = new Scanner(System.in);
			numguests = Enternumguests.nextLine(); 	
		
			System.out.println("Enter your booking date?"); 	
			Scanner Enterbookingdate = new Scanner(System.in);
			bookingdate = Enterbookingdate.nextLine(); 	
		
			if (numguests.equals("1")) {
				System.out.println("You have been assigned-"); 
			}
			
			else if (numguests.equals("2")) {
				System.out.println("You have been assigned-"); 
			}
			
			else if (numguests.equals("3")) {
				System.out.println("You have been assigned-"); 
			}
			
			else if (numguests.equals("4")) {
				System.out.println("You have been assigned-"); 
			}
			
			else if (numguests.equals("5")) {
				System.out.println("You have been assigned-"); 
			}
		
			else {
				System.out.println("You have not entered a correct option"); 
			}
		
		}
		
		else if (num.equals("2")) {
			System.out.println("You were assigned the Apartment " + booked + ". Would you like to erase this booking and start over?"); 	
			
		
			
		}
		
		//Default case- Will take users back to the Main class, User
		else {
			User.main(null);		
		}
	
	}
}