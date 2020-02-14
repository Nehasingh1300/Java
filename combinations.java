import java.util.Scanner;

public class Combinations {
	public static void main(String [] args) {  // printing all combinations of three numbers
		
		Scanner sc = new Scanner(System.in);
		
		String n0 = sc.nextLine(); 	// input number 1
		String n1 = sc.nextLine();	// input number 2
		String n2 = sc.nextLine();	// input number 3
		
		// Printig all patterns
		String num1 = n0+n1+n2;
		System.out.println(num1);
		String num2 = n0+n2+n1;
		System.out.println(num2);
		String num3 = n1+n0+n2;
		System.out.println(num3);
		String num4 = n1+n2+n0;
		System.out.println(num4);
		String num5 = n2+n0+n1;
		System.out.println(num5);
		String num6 = n2+n1+n0;
		System.out.println(num6);
		
	}

}
