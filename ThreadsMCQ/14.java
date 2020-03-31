// What will be the output of the following Java code?

    class multithreaded_programing
    {
        public static void main(String args[])
        {
            Thread t = Thread.currentThread();
            System.out.println(t);        
        }
    }
   /*
a) Thread[5,main]
b) Thread[main,5]
c) Thread[main,0]
d) Thread[main,5,main]
View Answer

Answer: d
Explanation: None.
Output:
$ javac multithreaded_programing.java
$ java multithreaded_programing
Thread[main,5,main]
*/
