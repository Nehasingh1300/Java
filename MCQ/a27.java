class GfG 
{ 
	public static void main(String args[]) 
	{ 
		String s1 = new String("geeksforgeeks"); 
		String s2 = new String("geeksforgeeks"); 
		if (s1 == s2) 
			System.out.println("Equal"); 
		else
			System.out.println("Not equal");          // s1 and s2 are two different objects the references are not the same
	} 
} 
