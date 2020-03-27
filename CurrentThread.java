package thread;

public class CurrentThread implements Runnable {

	CurrentThread() {
	      // main thread
	      Thread currThread = Thread.currentThread();
	      
	      // thread created
	      Thread t = new Thread(this, "Admin Thread");
	   
	      System.out.println("current thread = " + currThread);
	      System.out.println("thread created = " + t);
	      
	      // this will call run() function
	      t.start();
	   }

	   public void run() {
	      System.out.println("This is run() method");
	   }

	   public static void main(String args[]) {
	      new CurrentThread();
	   }
	} 
/*
current thread = Thread[main,5,main]
thread created = Thread[Admin Thread,5,main]
This is run() method

*/
