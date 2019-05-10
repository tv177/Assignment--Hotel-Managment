
public class Clientlogin extends Login {

	public static void clientlogin(){
	
		Client client = new Client();		
		
		System.out.println("This is the login for Client users"); 	
		
		//Getting the extended methods from the Login Class
		Login.Getusername();		
		Getpassword();

		//If the Client has entered the correct User-name and Password, they will gain access the main Program
		if (Username.equals("Client") & Password.equals("Client")) {
			client.clientwelcome();		 
		}
	
		//Default Case- If the Client has incorrectly entered their User-name or Password, they will be informed of this and be asked to try again
		else {
			System.out.println("Incorrect, try again" + "\n");
			Clientlogin.clientlogin();
		}
	}
	
}
