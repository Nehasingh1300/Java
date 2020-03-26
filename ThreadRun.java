package thread;

public class Run implements Runnable {

   Thread t;

   Run() {
    
      // thread created
      t = new Thread(this, "Admin Thread");
   
      // prints thread created
      System.out.println("thread  = " + t);
      
      // this will call run() function
      t.start();
   }

   public void run() {
      System.out.println("Inside run()function");
   }

   public static void main(String args[]) {
      new Run();
   }
}

// OUTPUT
//thread  = Thread[Admin Thread,5,main]
//Inside run()function
