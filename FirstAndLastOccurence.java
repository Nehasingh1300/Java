package stringHandling;
import java.util.Scanner;

public class FirstAndLastOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		occurence str1 = new occurence();
		str1.getString();
	}

}

class occurence{
	String mainstr;
	String substr;
	Scanner sc = new Scanner(System.in);
	
	void getString() {
		// input parent string and sub string
		System.out.print("Enter String: ");
		mainstr = sc.nextLine();
		System.out.print("Enter Sub String: ");
		substr = sc.nextLine();
		
		// check if substring is present in parent string or not
		if(mainstr.contains(substr)) {
			System.out.println(substr+ " is present in "+ mainstr);
		}
		else {
			System.out.println("Sub String not found!");
		}
	}
}
