//What will be the output of the following Java program?

    class newthread extends Thread
    {
	Thread t;
	String name;
	newthread(String threadname)
        {
	    name = threadname;
	    t = new Thread(this,name);
	    t.start();
	}
	public void run()
        {
        }
 
    }
    class multithreaded_programing
    {
        public static void main(String args[])
        {
	    newthread obj1 = 	 new newthread("one");
	    newthread obj2 =	 new newthread("two");
            try
            {
                Thread.sleep(1000);	
                System.out.print(obj1.t.isAlive());
            }
            catch(InterruptedException e)
            {
	    System.out.print("Main thread interrupted");
            }
        }
    }/*
a) true
b) false
c) Main thread interrupted
d) None of the mentioned
View Answer

Answer: b
Explanation: Thread.sleep(1000) has caused all the threads to be suspended for some time, hence onj1.t.isAlive() returns false.
Output:
advertisement

$ javac multithreaded_programing.java
$ java multithreaded_programing
false/*
