    class multithreaded_programing
    {
        public static void main(String args[])
        {
            Thread t = Thread.currentThread();
            t.setName("New Thread");
            System.out.println(t);        
        }
    }
    /*
a) Thread[5,main]
b) Thread[New Thread,5]
c) Thread[main,5,main]
d) Thread[New Thread,5,main]
View Answer

Answer: d
Explanation: None.
Output:
$ javac multithreaded_programing.java
$ java multithreaded_programing
Thread[New Thread,5,main]
name of thread  priority function*/
