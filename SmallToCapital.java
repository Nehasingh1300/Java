package stringHandling;
import java.util.Scanner;

public class SmallToCapital {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		capital c1 = new capital();
		c1.convertToCap();
	}
}

class capital{
	Scanner sc = new Scanner(System.in);
	
	void convertToCap() {   // 65  A         97  a
		System.out.print("Enter String to be converted to Capital Letters :  ");
		StringBuffer str = new StringBuffer();   //string buffer string as it is not  immutable
		str.append(sc.nextLine());    // by using append we can input the string

			for(int i=0; i<str.length();i++) {     	// for loop for the iteration of each  character of string
				char c = str.charAt(i);     		// getting char at particular index
				int ascii = c;              		// storing char at integer so storing its ASCII value
				if(ascii >= 97 || ascii <= 122) { 	// check if character is in small case
					 int num = ascii;         		// storing ASCII value in variable 
				     int nan = num - 32;			// altering ASCII value so as to convert the lower case to upper case
				     String str1 = null; 			// declaring new null string
				     str1 = Character.toString((char)nan);		// storing the altered string in new string
				     
				     str.replace(i, i+1, str1);	   	 // replacing the lower case char with upper case
					
				}
			}
		     System.out.println("\n\nNew "+str);	// printing the final string with all character as full string
	}
}
