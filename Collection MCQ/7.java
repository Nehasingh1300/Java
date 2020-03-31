// What will be the output of the following Java program?

    import java.util.*;
    class Bitset 
    {
        public static void main(String args[]) 
        {
            BitSet obj = new BitSet(5);
            for (int i = 0; i < 5; ++i)
                obj.set(i);
            obj.clear(2);
            System.out.print(obj);
        }
    }/*
a) {0, 1, 3, 4}
b) {0, 1, 2, 4}
c) {0, 1, 2, 3, 4}
d) {0, 0, 0, 3, 4}
View Answer

Answer: a
Explanation: None.
Output:
$ javac Bitset.java
$ java Bitset
{0, 1, 3, 4}*/
