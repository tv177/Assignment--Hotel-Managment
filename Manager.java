import java.util.Scanner;

public class Manager extends User {

//Instance Variables	
static String num = "";		
	
	public void managerwelcome(){	
		
		System.out.println("\n" + "Welcome Managers! Press 1 if you would like to view all the bookings. Press 2 if you want to manage a booking. Press any other character to go back.");	
	
		//The variable "Num" will contain the string entered using the scanner "Enternum"
		Scanner Enternum = new Scanner(System.in);
		num = Enternum.nextLine(); 	
	
		if (num.equals("1")) {
			System.out.println("Finally"); 		 
		}
		
		else if (num.equals("2")) {
			System.out.println("Finally"); 	
			
		}
		
		//Default case- Will take users back to the Main class, User
		else {
			User.main(null);		
		}
	
	}
}