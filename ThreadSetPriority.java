package thread;

public class SetPriority extends Thread  
{    
    public void run()  
    {    
        System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());  
        /* Thread java.lang.Thread.currentThread() Returns a reference to the currently executing thread object. Returns:the currently executing thread.*/
    }    
    public static void main(String args[])  
    {    
        // creating one thread   
        SetPriority t1=new SetPriority();    
        // print the maximum priority of this thread  
        t1.setPriority(Thread.MAX_PRIORITY); // int java.lang.Thread.MAX_PRIORITY : 10 [0xa] The maximum priority that a thread can have.
   
        // call the run() method  
        t1.start();    
    }    
}
/*
Priority of thread is: 10
*/
