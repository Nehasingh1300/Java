package wrapper;

public class conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		convert c1 = new convert();
		c1.getinfo();
	}

}

class convert{

	void getinfo() {
	int a = 2039605780;
	System.out.println("int a = "+a);   		
	Integer a1 = new Integer(a);				// int to Integer
	System.out.println("Integer a1 = "+a1);		
	String a2 = Integer.toString(a1);			// Integer to String
	System.out.println("String a2 = "+a2);		
	int a3 = Integer.parseInt(a2);				// String to int
	System.out.println("String a3 = "+a3);
	String a4 = String.valueOf(a3); 			// int to String
	System.out.println("String a4 = "+a4);
	Integer a5 = new Integer(a4); 				// string to Integer
	System.out.println("Integer a5 = "+a5);
	int a6 = a5.intValue();						// Integer to int
	System.out.println("int a6 = "+a6);
	}
}
