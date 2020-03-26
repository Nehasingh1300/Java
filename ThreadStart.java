package thread;

public class Start implements Runnable {

   Thread t;
   Start() {
    
      // thread created
      t = new Thread(this, "Admin Thread");
     
      // prints thread created
      System.out.println("thread  = " + t);
      
      // this will call run() function
      System.out.println("Calling run() function... ");
      t.start();
   }

   public void run() {
      System.out.println("Inside run()function");
   }

   public static void main(String args[]) {
      new Start();
   }
} 

/*
thread  = Thread[Admin Thread,5,main]
Calling run() function... 
Inside run()function

*/
