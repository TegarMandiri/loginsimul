//Finished, will added more features++
//Ver. 1.05

import java.util.Scanner;

public class login{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

//Credit Tegar Mandiri 2019
//Contact email: tegarmndr@gmail.com

		System.out.println(" ");
		System.out.println(" ");
		System.out.println("//Copyright Tegar Mandiri 2019");
		System.out.println("-Ver. 1.05");
		System.out.println(" ");
		System.out.println("   ------- Login Simulation -------    ");
		System.out.println(" ");
		System.out.println("--------------- Sign Up ---------------");
		System.out.println(" ");
		System.out.print("Username 	: ");
		String unm = scan.nextLine();

		System.out.print("Password 	: ");
		String pwd = scan.nextLine();

		System.out.print("Repeat Password : ");
		String rpwd = scan.nextLine();

		if (pwd.equals(rpwd)){
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("--------------- Sign In ---------------");
			System.out.println(" ");
			System.out.print("Username 	: ");
			String unm2 = scan.nextLine();

			if (unm.equals(unm2)){
				System.out.print("Password 	: ");
				String pwd2 = scan.nextLine();

				if (pwd.equals(pwd2)){
					System.out.println("---------------");
					System.out.println("Login Success");
				}else{
					System.out.println("---------------");
					System.out.println("Login Failed");
				}

			}else{
				System.out.println("---------------");
				System.out.println("Wrong Username");
			}

		}else{
			System.out.println("---------------");
			System.out.println("Wrong Password");
		}

		System.out.println(" ");
	}
}
