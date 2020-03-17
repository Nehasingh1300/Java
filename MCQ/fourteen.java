package random;

public class fourteen {
	public static void gfg(String s) // In case of method overloading, the most specific method is chosen at compile time. 
	{	 
		System.out.println("String"); 
	} 
	public static void gfg(Object o) 
	{ 
		System.out.println("Object"); 
	} 

	public static void main(String args[]) 
	{ 
		gfg(null); 
	} 
} 
