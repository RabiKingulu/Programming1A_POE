/*
References:
ChatGPT (OpenAI) – assisted with Java validation logic and regex
YouTube: https://youtu.be/LBXE4Fy3zPI
 (Used to understand Java class naming and fix class/file name mismatch error)
*/

import java.util.*;
public class Registration
{
	public static void main(String[]arg){
		Scanner input = new Scanner(System.in);
		String Username;
		String Password;
		String CellPhoneNumber;
		System.out.println("Enter your username");
		Username = input.next();
		if (Username.contains("_") && Username.length()<=5)
			{System.out.println("Username successfully captured");
			} else {System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and so no longer than 5 characters in length.");}
			System.out.println("Enter your password");
			Password = input.next();
			if (Password.length()>=8 && Password.matches(".*[A-Z].*") && Password.matches(".*[0-9].*") && Password.matches(".*[^a-zA-Z0-9].*"))
				{System.out.println("Password successfuly captured");
				}
				else
					{System.out.println("Password is not correctly formatted, please ensure that the password contains atleast 8 a characters, a capital letter, a number , and a special character.");
					}
					System.out.println("Enter cellphone number");
					CellPhoneNumber = input.next();
					if (CellPhoneNumber.matches("^\\+27[0-9]{9}$")){
						System.out.println("Cellphone number successfully added");
					}
					else {System.out.println("Cellphone number incorrectly formatted or does not contain international code"); }
					
}
}
