public class Main
{
    static int i,c=0,res;
    
    static int charcount(String s)
    {
        for(i=0,c=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            c++;
        }
        return c;
    }
    
    public static void main (String args[])
    {
        res=Main.charcount(" manchester united is also known as red devil ");
        //string is always passed in double quotes
        
        System.out.println("The number of characters in the String are :  "+res);
    }
}
/*
The number of characters in the String are :  37  
*/
