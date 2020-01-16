// Calculator using command line argument by Neha Singh 16 jan, 2020

public class Calculator1{
	Public Static void main( String [] args ){
		int a = Integer.parseInt(args[0]);    // convert string to integer
		int b = Integer.parseInt(args[2]);
		
		if(args[1] == "+")                    // if operator given is + then print addition
			System.out.println(a+b);
		else if(args[1] == "-")               // if operator given is - then print subtraction
			System.out.println(a-b);
		else if(args[1] == "*")               // if operator given is * then print multiplication
			System.out.println(a*b);
		else if(args[1] == "/")               // if operator given is / then print division
			System.out.println(a/b);
		else                                 // print wrong choice
			System.out.println("Wrong choice");

//s.string(s1)
	}
}
