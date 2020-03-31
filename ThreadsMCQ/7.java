//What is the name of the thread in output in the following Java program?

    class multithreaded_programing
    {
        public static void main(String args[])
        {
            Thread t = Thread.currentThread();
            System.out.println(t.isAlive());        
        }
    }
/*a) 0
b) 1
c) true
d) false
View Answer

Answer: c
Explanation: Thread t is seeded to currently program, hence when you run the program the thread becomes active & code ‘t.isAlive’ returns true.
Output:
$ javac multithreaded_programing.java
$ java multithreaded_programing
true*/
