// What is the priority of the thread in output in the following Java program?

    class multithreaded_programing
    {
        public static void main(String args[])
        {
            Thread t = Thread.currentThread();
            t.setName("New Thread");
            System.out.println(t.getName());        
        }
    }
/*a) main
b) Thread
c) New Thread
d) Thread[New Thread,5,main]
View Answer

Answer: c
Explanation: The getName() function is used to obtain the name of the thread, in this code the name given to thread is ‘New Thread’.
Output:
$ javac multithreaded_programing.java
$ java multithreaded_programing
New Thread*/
