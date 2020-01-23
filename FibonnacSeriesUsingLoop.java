// Fibonnaci using loop by Neha Singh on 16 jan, 2020

Public class Fibonnaci{                                     // calling class Largest(capital L) evreything in java is class
	Public static void main(String [] args){            // main function for execution
		int num = Integer.parseInt(args [0]);       // conversion of string to integer
		int arr[];                                  // array to store values of fibonnaci series
		arr[0] = 0;                                 // first element is 0
		arr[1] = 1;                                 // second element is 1

		for(int i = 0; i<num; i++){
			arr[i] = arr[i-1] + arr[i-2];	    // adding elements 
		}
		
		for( int k = 0; k<num; k++ )
			System.out.println(arr[k]);		
		
	}
}
