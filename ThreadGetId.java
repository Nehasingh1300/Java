package thread;

public class GetId implements Runnable {

	   Thread t;
	   GetId() {

	      // thread created
	      t = new Thread(this, "Admin Thread");
	      
	      // set thread priority
	      t.setPriority(1);
	      
	      // prints thread created
	      System.out.println("thread  = " + t);
	      
	      // this will call run() function
	      t.start();
	   }

	   public void run() {
	      // returns the identifier of this Thread.
	      System.out.println("Name = " + t.getName());
	      System.out.print("Id = " + t.getId());
	   }

	   public static void main(String args[]) {
	      new GetId();
	   }
	}
/*
thread  = Thread[Admin Thread,1,main]
Name = Admin Thread
Id = 10
*/
