package Exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class inputMisMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();   // typing integer will not give error
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
		}
		catch (InputMismatchException e) {   // if other than integer is input then throw error
	        System.out.print("Invalid SAP ID");			
		}
	}
}
