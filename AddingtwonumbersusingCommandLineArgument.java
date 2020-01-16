// Adding two numbers using Command Line Argument done by Neha Singh on 16 jan, 2020

Public class Largest{                                       // calling class Largest(capital L) evreything in java is class
	Public static void main(String [] args){            // main function for execution
		int a = Integer.parseInt(args [0]);         // conversion of string to integer
		int b = Integer.parseInt(args [1]);

		int c = a + b ;
		System.out.println("Sum of " + a + " + " + b + " is " + c);                      // printing sum of two numbers
		
	}
}
