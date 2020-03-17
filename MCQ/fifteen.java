package random;

public class fifteen {
	public static void gfg(String s) 
	{	 
		System.out.println("String"); 
	} 
	public static void gfg(Object o) 
	{ 
		System.out.println("Object"); 
	} 
	public static void gfg(Integer i) 
	{ 
		System.out.println("Integer"); 
	} 

	public static void main(String args[]) 
	{ 
		gfg(null); 						// As ‘java.lang.String’ and ‘java.lang.Integer’ is a more specific type than ‘java.lang.Object’,but between ‘java.lang.String’ and ‘java.lang.Integer’ none is more specific.
	} 
} //end class 
