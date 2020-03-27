package thread;

public class Yeild implements Runnable {

	   Thread t;

	   Yeild(String str) {

	      t = new Thread(this, str);
	      // this will call run() function
	      t.start();
	   }

	   public void run() {

	      for (int i = 0; i < 5; i++) {
	         // yields control to another thread every 5 iterations
	         if ((i % 5) == 0) {
	            System.out.println(Thread.currentThread().getName() + " yielding control...");

	            /* causes the currently executing thread object to temporarily 
	            pause and allow other threads to execute */
	            Thread.yield();
	         }
	      }

	      System.out.println(Thread.currentThread().getName() + " has finished executing.");
	   }

	   public static void main(String[] args) {
	      new Yeild("Thread 1");
	      new Yeild("Thread 2");
	      new Yeild("Thread 3");
	   }
	}
/*
Thread 1 yielding control...
Thread 2 yielding control...
Thread 1 has finished executing.
Thread 3 yielding control...
Thread 2 has finished executing.
Thread 3 has finished executing.
*/
