public class StringDemo
{
    static int i,c=0,res;
    static int wordcount(String s)
    {
        char ch[]= new char[s.length()];      //in string especially we have to mention the () after length
        for(i=0;i<s.length();i++)
        {
            ch[i]= s.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
            c++;
        }
        return c;
    }
    
    public static void main (String args[])
    {
        res=StringDemo.wordcount(" My name is Neha Singh ");
        //string is always passed in double quotes
        
        System.out.println("The number of words in the String are :  "+res);
    }
}
