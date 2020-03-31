//What will be the output of the following Java program?

    interface calculate
    {
        void cal(int item);
    }
    class display implements calculate
    {
        int x;
        public void cal(int item)
        {
            x = item * item;            
        }
    }
    class interfaces
    {
        public static void main(String args[])
        {
            display arr = new display;
            arr.x = 0;      
            arr.cal(2);
            System.out.print(arr.x);
        }
    }/*
a) 0
b) 2
c) 4
d) None of the mentioned
View Answer

Answer: c
Explanation: None.
Output:
$ javac interfaces.java
$ java interfaces
4*/
