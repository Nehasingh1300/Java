//Write a Java program to create five threads with different priorities. Send two threads of the highest priority to sleep state.
//Check the aliveness of the threads and mark which thread is long lasting
package thread; 

public class Exp9_4 extends Thread{
	
	
	 public void run()  
	    {    
	        System.out.println("running  - " + Thread.currentThread().getPriority()+" - " +Thread.currentThread().getName());
	        int n = Thread.currentThread().getPriority();
	        if(n==10) {
	        	try {
		            // thread to sleep for 1000 milliseconds plus 500 nanoseconds
		            Thread.sleep(1000,500);
		         } catch (Exception e) {
		            System.out.println(e);
		         }
	        }
	        else if(n==9) {
	        	try {
		            // thread to sleep for 1000 milliseconds plus 500 nanoseconds
		            Thread.sleep(1000,500);
		         } catch (Exception e) {
		            System.out.println(e);
		         }
	        }
	        else {
	        	System.out.print(" ");
	        }
	        while(Thread.currentThread().isAlive())
            {
                System.out.println("Long lasting thread:"+Thread.currentThread().getName());
            }
	    }    
	    public static void main(String args[])  
	    {    
	          
	    	Exp9_4 t1=new Exp9_4();    
	    	Exp9_4 t2=new Exp9_4();  
	    	Exp9_4 t3=new Exp9_4();    
	    	Exp9_4 t4=new Exp9_4();
	    	Exp9_4 t5=new Exp9_4();
	        t1.setPriority(4);  
	        t2.setPriority(7); 
	        t3.setPriority(10);  
	        t4.setPriority(9); 
	        t5.setPriority(1);  
	        System.out.println("Priority of thread t1 is: " + t1.getPriority()); //4  
	        System.out.println("Priority of thread t2 is: " + t2.getPriority()); //7  
	        System.out.println("Priority of thread t3 is: " + t3.getPriority()); //10  
	        System.out.println("Priority of thread t4 is: " + t4.getPriority()); //9
	        System.out.println("Priority of thread t5 is: " + t5.getPriority()+"\n\n"); //1 
	        t1.start(); 
	        t2.start(); 
	        t3.start(); 
	        t4.start(); 
	        t5.start(); 
	    }

}
