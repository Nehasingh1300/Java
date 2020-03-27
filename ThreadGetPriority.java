package thread;

public class Get extends Thread  
{    
    public void run()  
    {    
        System.out.println("running thread name is:"+Thread.currentThread().getName());    
    }    
    public static void main(String args[])  
    {    
        // creating two threads  
        Get t1 = new Get();    
        Get t2 = new Get();    
        // print the default priority value of thread  
        System.out.println("t1 thread priority : " + t1.getPriority());   
        System.out.println("t2 thread priority : " + t2.getPriority());  
        // this will call the run() method  
        t1.start();    
        t2.start();  
    }    
} 
/*
t1 thread priority : 5
t2 thread priority : 5
running thread name is:Thread-0
running thread name is:Thread-1
*/
