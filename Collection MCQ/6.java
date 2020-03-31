//What will be the output of the following Java program?

    import java.util.*;
    class Array 
    {
        public static void main(String args[]) 
        {
            int array[] = new int [5];
            for (int i = 5; i > 0; i--)
                array[5-i] = i;
            Arrays.fill(array, 1, 4, 8);
            for (int i = 0; i < 5 ; i++)
                System.out.print(array[i]);
        }
    }/*
a) 12885
b) 12845
c) 58881
d) 54881
View Answer

Answer: c
Explanation: array was containing 5,4,3,2,1 but when method Arrays.fill(array, 1, 4, 8) is called it fills the index location starting with 1 to 4 by value 8 hence array becomes 5,8,8,8,1.
Output:
$ javac Array.java
$ java Array
58881*/
