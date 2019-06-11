//Finished, will added more features++
//Ver. 1.50
//Credit Tegar Mandiri 2019
//Contact email: tegarmndr@gmail.com

import java.util.Scanner;

public class login{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println(" ");
		System.out.println(" ");
		System.out.println("//Copyright Tegar Mandiri 2019");
		System.out.println("-Ver. 1.50");
		System.out.println(" ");
		System.out.println("   ------- Login Simulation -------    ");
		System.out.println(" ");
		System.out.println("--------------- Sign Up ---------------");
		System.out.println(" ");
		System.out.print("Username 	: ");
		String usernameSignUp = scan.nextLine();

		System.out.print("Password 	: ");
		String passwordSignUp = scan.nextLine();

		System.out.print("Repeat Password : ");
		String repeatPassword = scan.nextLine();

		if (passwordSignUp.equals(repeatPassword)){

			System.out.println(" ");
			System.out.println(" ");
			System.out.println("--------------- Sign In ---------------");
			System.out.println(" ");
			System.out.print("Username 	: ");
			String usernameSignIn = scan.nextLine();

			if (usernameSignUp.equals(usernameSignIn)){

				System.out.print("Password 	: ");
				String passwordSignIn = scan.nextLine();

				if (passwordSignUp.equals(passwordSignIn)){

					System.out.println("---------------");
					System.out.println("Login Success");

				} else {

					System.out.println("---------------");
					System.out.println("Login Failed");

				}

			} else {

				System.out.println("---------------");
				System.out.println("Wrong Username");

			}

		} else {

			System.out.println("---------------");
		
			System.out.println("Wrong Password");
		}

		System.out.println(" ");

	}
}
