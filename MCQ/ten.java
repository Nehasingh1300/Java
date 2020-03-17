package random;

public class ten {	 
	int x = 2; 
	ten(int i) { x = i; } 					// as the value of x has been initialized with the constructor so it overrides it and become 10
	public static void main(String[] args) {	 
		ten t = new ten(5); 
		System.out.println("x = " + t.x); 
	} 
} 
