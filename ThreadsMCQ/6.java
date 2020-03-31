// What is the name of the thread in output in the following Java program?

    class multithreaded_programing
    {
        public static void main(String args[])
        {
            Thread t = Thread.currentThread();
            System.out.println(t.getPriority());        
        }
    }
/*a) 0
b) 1
c) 4
d) 5
View Answer

Answer: d
Explanation: The default priority given to a thread is 5.
Output:
$ javac multithreaded_programing.java
$ java multithreaded_programing
5*/
