import java.util.Scanner;

interface test{     // Declaring abstract method
	void square(int num); // abstract method
}

class arithmetic implements test{    // need to call this object 
	public void square(int num) {
		System.out.println("Square of "+num+" is "+ num*num);
	}
}

class ToTestInt extends arithmetic implements test {
	// creating object of arithmetic class
	arithmetic ar = new arithmetic();
	// using object of arithmetic class
	
	
	void useAri(int num){
		this.square(num); // calling square method from ToTestInt class
		ar.square(num);	 // calling square method from arithmetic class
	}
}

public class TEST1 {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		// creating object of arithmetic class
		//arithmetic ar = new arithmetic();
		
		// taking input of integer variable
		int num = sc.nextInt();
		
		//ar.square(num);
		
		//calling ToTestInt
		ToTestInt tti = new	ToTestInt();
		tti.useAri(num);
	}
	
}
