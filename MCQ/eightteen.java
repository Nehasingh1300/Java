package random;

class First 
{ 
	public First() { System.out.println("a"); } 
} 

class Second extends First 
{ 
	public Second() { System.out.println("b"); } 
} 

class Third extends Second 
{ 
	public Third() { System.out.println("c"); } 
} 

public class eightteen 
{ 
	public static void main(String[] args) 
	{ 
		Third c = new Third(); 
	} 
} 

// While creating a new object of ‘Third’ type, before calling the default constructor of Third class, the default constructor of super class is called i.e, Second class and then again before the default constructor of super class, default constructor of First class is called. And hence gives such output.
