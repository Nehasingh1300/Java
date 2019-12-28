import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
        static int B,H; 
        static boolean flag;

    static{
        Scanner s = new Scanner(System.in);
        B = s.nextInt();
        H = s.nextInt();
        if(B>=1 & H>=1){
            flag=true;
        }
        else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    /*static boolean flag = true; static int B,H;

    static{ 
    Scanner sc = new Scanner(System.in);

    B = sc.nextInt(); 
    H = sc.nextInt(); 
    boolean flag = true; 
    if(B<=0||H<=0){ 
        System.out.println("java.lang.Exception: Breadth and height must be positive"); 
        flag = false; 
        System.exit(0); 
    }
}
*/
public static void main(String[] args){
