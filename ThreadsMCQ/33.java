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
                 System.out.print(obj1.t.equals(obj2.t));
            }
            catch(Exception e)
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
Explanation: Both obj1 and obj2 have threads with different name that is “one” and “two” hence obj1.t.equals(obj2.t) returns false.
Output:
$ javac multithreaded_programing.java
$ java multithreaded_programing
false*/
