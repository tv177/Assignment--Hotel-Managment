import java.util.Scanner;

public class Login {

//Instance Variables
static String Username = "";
static String Password = "";	
	
	public static void Getusername(){
	
		System.out.println("Please enter your Username");
	
		//The variable "Username" will contain the string entered using the scanner "Enterusername"
		Scanner Enterusername = new Scanner(System.in);
		Username = Enterusername.nextLine(); 	
	}

	public static void Getpassword(){
	
		System.out.println("Please enter your Password");
	
		//The variable "Password" will contain the string entered using the scanner "Enterpassword"
		Scanner Enterpassword = new Scanner(System.in);
		Password = Enterpassword.nextLine(); 
	}

}
