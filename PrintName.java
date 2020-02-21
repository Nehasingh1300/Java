// 20-02-20; enter name and print ms/mr short name with welcome message and then you are nth guest
package pkg1;
import java.util.Scanner;

public class PrintName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    
			int i=0;
		
			//Guest g[] = new Guest[100];
			
			Scanner sc = new Scanner(System.in);
			
			Guest g = new Guest();
			g.knowGender();
			i++;
			
	}
		
}

class Guest{
	Scanner sc = new Scanner(System.in);
	
	void knowGender() {
		System.out.println("Enter 1 For Female and other for male");
		int choice  = sc.nextInt();
		if(choice == 1) {
			this.getFirstNameFemale();
		}
		else {
			this.getFirstNameMale();
		}
	}
	
	//Code for female name
	void getFirstNameFemale() {
		
		String s = sc.nextLine();
		System.out.println("Enter First Name");
		String FirstName = sc.nextLine();
		System.out.println("Enter Second Name");
		String SecondName = sc.nextLine();
		System.out.println("Enter Surname");
		String SurName = sc.nextLine();
		System.out.println("Welcome Ms "+FirstName.charAt(0)+SecondName.charAt(0)+" "+SurName);
		//System.out.println("You are "+this.i+" Guest");
		
		//System.out.println("Enter 1 to continue");
		//int num = sc.nextInt();
	}
	
	// Code for male name
	void getFirstNameMale() {
		String s = sc.nextLine();
		System.out.println("Enter First Name");
		String FirstName = sc.nextLine();
		System.out.println("Enter Second Name");
		String SecondName = sc.nextLine();
		System.out.println("Enter Surname");
		String SurName = sc.nextLine();
		System.out.println("Welcome Mr "+FirstName.charAt(0)+SecondName.charAt(0)+" "+SurName);
		//System.out.println("You are "+this.i+" Guest");
	}
}
