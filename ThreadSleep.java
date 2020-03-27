package thread;

public class Sleep implements Runnable { 
//The Runnable interface should be implemented by anyclass whose instances are intended to be executed by a thread. 
//Theclass must define a method of no arguments called run. 

	   Thread t;

	   public void run() {
	      for (int i = 10; i < 13; i++) {

	         System.out.println(Thread.currentThread().getName() + "  " + i);
	         try {
	            // thread to sleep for 1000 milliseconds plus 500 nanoseconds
	            Thread.sleep(1000,500);
	         } catch (Exception e) {
	            System.out.println(e);
	         }
	      }
	   }

	   public static void main(String[] args) throws Exception {
	      Thread t = new Thread(new Sleep());
	      // this will call run() function
	      t.start();

	      Thread t2 = new Thread(new Sleep());
	      // this will call run() function
	      t2.start();
	   }
	}
/*
1000   
Thread-0  10
Thread-1  10
Thread-0  11
Thread-1  11
Thread-0  12
Thread-1  12


*/
