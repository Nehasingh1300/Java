class GfG 
{ 
	public static void main(String args[]) 
	{ 
		try
		{ 
			System.out.println("First statement of try block"); 
			int num=45/3; 
			System.out.println(num); 
		} 
		catch(Exception e) 
		{ 
			System.out.println("Gfg caught Exception"); 
		} 
		finally
		{ 
			System.out.println("finally block"); // no eception so finally called with normal execution
		} 
		System.out.println("Main method"); 
	} 
} 
