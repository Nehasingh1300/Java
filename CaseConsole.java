package stringHandling;

public class CaseConsole {

	public static void main(StringBuffer args) {
		// TODO Auto-generated method stub

		StringBuffer str = new StringBuffer();
		str = args;
		System.out.println(str);
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
