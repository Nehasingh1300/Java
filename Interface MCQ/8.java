//What will be the output of the following Java program?

    interface calculate
    {
        void cal(int item);
    }
    class displayA implements calculate
    {
        int x;
        public void cal(int item)
        {
            x = item * item;            
        }
    }
    class displayB implements calculate
    {
        int x;
        public void cal(int item)
        {
            x = item / item;            
        }
    }
    class interfaces 
    {
        public static void main(String args[])
        {
            displayA arr1 = new displayA;
            displayB arr2 = new displayB;
            arr1.x = 0;
            arr2.x = 0;      
            arr1.cal(2);
            arr2.cal(2);
            System.out.print(arr1.x + " " + arr2.x);
        }
    }/*
a) 0 0
b) 2 2
c) 4 1
d) 1 4
View Answer

Answer: c
Explanation: class displayA implements the interface calculate by doubling the value of item, where as class displayB implements the interface by dividing item by item, therefore variable x of class displayA stores 4 and variable x of class displayB stores 1.
Output:
advertisement

$ javac interfaces.java
$ java interfaces
4 1*/
