//What will be the output of the following Java program?

    class newthread extends Thread
    {
	Thread t;
	newthread()
        {
	    t1 = new Thread(this,"Thread_1");
	    t2 = new Thread(this,"Thread_2");
	    t1.start();
	    t2.start();
	}
	public void run()
        {
	    t2.setPriority(Thread.MAX_PRIORITY);	
	    System.out.print(t1.equals(t2));
        }    
    }
    class multithreaded_programing
    {
        public static void main(String args[])
        {
            new newthread();        
        }
    }/*
a) true
b) false
c) truetrue
d) falsefalse
View Answer

Answer: d
Explanation: This program was previously done by using Runnable interface, here we have used Thread class. This shows both the method are equivalent, we can use any of them to create a thread.
Output:
$ javac multithreaded_programing.java
$ java multithreaded_programing
falsefalse*/
