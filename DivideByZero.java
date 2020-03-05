package Exception;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 
	         int a[] = new int[5];
	         a[5] = 30/0;  
	      }  
		
		  // catch if divide by zero
	      catch(ArithmeticException e){System.out.println("do not divide by zero" + e);}  
	      //catch if array out of bound
		  catch(ArrayIndexOutOfBoundsException e){System.out.println(" do not go out of array boundation" + e);}  
	      // catch 	any exception
		  catch(Exception e){System.out.println("task completed" + e );} 
  }  
}


