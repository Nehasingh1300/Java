// Largests of three numbers by Neha Singh on 16 jan, 2020

Public class Largest{                                       // calling class Largest(capital L) evreything in java is class
	Public static void main(String [] args){            // main function for execution
		int a = Integer.parseInt(args [0]);         // conversion of string to integer
		int b = Integer.parseInt(args [1]);
		int c = Integer.parseInt(args [2]);

		if( a > b && a > c ){                       // check if a is greater than b & c
			System.out.println(a);    
		}
		else if( b > a && b > c ){                  // check if b is greater than a & c
			System.out.println(b);
		}
		else                                        // check if c is greater than b & a 
			System.out.println(c);
	}
}
