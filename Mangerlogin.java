
public class Mangerlogin extends Login {

	public static void managerlogin(){   
	
		Manager manager = new Manager();		
		
		System.out.println("This is the login for Manager users"); 	
		
		//Getting the extended methods from the Login Class
		Login.Getusername();		
		Getpassword();

		//If the Manager has entered the correct User-name and Password, they will gain access to the main Program
		if (Username.equals("Manager") & Password.equals("Manager")) {	
			manager.managerwelcome();
		}
	
		//Default Case- If the Manager has incorrectly entered their User-name or Password, they will be informed of this and be asked to try again
		else {
			System.out.println("Incorrect, try again" + "\n");
			Mangerlogin.managerlogin();
		}
	}
	
}