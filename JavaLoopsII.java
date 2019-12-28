import java.util.*;
import java.lang.Math; 
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int[] intArray = new int[15];
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            intArray[0]= a + b;
            for(int j=0; j<n-1; j++){
                int k=2;
                int c = (int )Math.pow(k , j);
                intArray[j+1]= intArray[j] + 2*(c * b) ;
            }
            for(int j=0; j<n; j++){
                System.out.print(intArray[j]+" ");
            }
            System.out.println(" ");
        }
        
        in.close();
    }
}

