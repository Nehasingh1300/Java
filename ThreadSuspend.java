package thread;

public class Suspend extends Thread  
{    
    public void run()  
    {    
        for(int i=1; i<5; i++)  
        {    
            try  
            {  
                // thread to sleep for 500 milliseconds  
                 sleep(500);  
                 System.out.println(Thread.currentThread().getName());    
            }catch(InterruptedException e){System.out.println(e);}    
            System.out.println(i);    
        }    
    }    
    public static void main(String args[])  
    {    
        // creating three threads   
    	Suspend t1=new Suspend ();    
    	Suspend t2=new Suspend ();   
    	Suspend t3=new Suspend ();   
        // call run() method   
        t1.start();  
        t2.start();  
        // suspend t2 thread   
        t2.suspend();   
        // call run() method   
        t3.start();  
    }    
}  
/*Thread-2
Thread-0
1
1
Thread-0
2
Thread-2
2
Thread-2
3
Thread-0
3
Thread-2
4
Thread-0
4
*/
