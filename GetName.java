package thread;
import java.lang.reflect.Method; //A Method provides information about, and access to, a single method on a class or interface.
//The reflected method may be a class method or an instance method (including an abstract method). 

public class GetName  { 

	// Main method 
	public static void main(String[] args) 
	{ 

		try { 
			// create class object 
			Class classobj = GetName.class; 

			// get list of methods 
			Method[] methods = classobj.getMethods(); 

			// get the name of every method present in the list 
			for (Method method : methods) { 
				String MethodName = method.getName(); 
				System.out.println("Name of the method: "+ MethodName); 
			} 
		} 
		catch (Exception e) { 
			e.printStackTrace(); 
		} 
	} 

	// method name setValue 
	public static int setValue() 
	{ 
		System.out.println("setValue"); 
		return 24; 
	} 

	// method name getValue 
	public String getValue() 
	{ 
		System.out.println("getValue"); 
		return "getValue"; 
	} 

	// method name setManyValues 
	public void setManyValues() 
	{ 
		System.out.println("setManyValues"); 
	} 
}
/*
Name of the method: main
Name of the method: getValue
Name of the method: setValue
Name of the method: setManyValues
Name of the method: wait
Name of the method: wait
Name of the method: wait
Name of the method: equals
Name of the method: toString
Name of the method: hashCode
Name of the method: getClass
Name of the method: notify
Name of the method: notifyAll

*/
