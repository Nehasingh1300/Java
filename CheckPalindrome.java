import java.util.*;
import java.lang.String;
public class Palindrome
{
    static Scanner console = new Scanner(System.in);
    
    public Palindrome()
    {
        
    }
    
    public static void main(String[] args)
    {//declare the variables
        String str,another="y";
        //start the loop
        while(another.equalsIgnoreCase("y"))
        {
            
            
            //prompt the user
            System.out.print("Enter a word to see if its a Palindrome; ");
            str= console.next();
            System.out.println();
            //
            //the answer
            
            if(isPalindrome(str))
            
            System.out.println( str + " is a palindrome");
            else
            System.out.println(str + " not a palindrome");
            
            
            System.out.print("test another(y/n)? ");
            another= console.next();
            
        }
    }
    
    public static boolean isPalindrome(String str)
    {
        return isPalindrome(str,0,str.length()-1);
        
    }
    public static boolean isPalindrome(String str,int low, int high)
    {  if(high <= low)
        return true;
        else if (str.charAt(low)!= str.charAt(high))
        return false;
        else
        return isPalindrome(str,low+1,high-1);
        
        
        
    }
}
/*
import java.util.*;
import java.lang.String;
public class Palindrome
{
    static Scanner console = new Scanner(System.in);
    
    public Palindrome()
    {
        
    }
    
    public static void main(String[] args)
    {//declare the variables
        String str,another="y";
        //start the loop
        while(another.equalsIgnoreCase("y"))
        {
            
            
            //prompt the user
            System.out.print("Enter a word to see if its a Palindrome; ");
            str= console.next();
            System.out.println();
            //
            //the answer
            
            if(isPalindrome(str))
            
            System.out.println( str + " is a palindrome");
            else
            System.out.println(str + " not a palindrome");
            
            
            System.out.print("test another(y/n)? ");
            another= console.next();
            
        }
    }
    
    public static boolean isPalindrome(String str)
    {
        return isPalindrome(str,0,str.length()-1);
        
    }
    public static boolean isPalindrome(String str,int low, int high)
    {  if(high <= low)
        return true;
        else if (str.charAt(low)!= str.charAt(high))
        return false;
        else
        return isPalindrome(str,low+1,high-1);
        
        
        
    }
}
*/
