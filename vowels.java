public class VowelsCount
{
    static int i,c,res;
    
    static int vowelcount(String s)
    {
        for(i=0,c=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
            c++;
        }
        return c ;
    }
    
    public static void main (String args[])
    {
        
        System.out.println("Original String is : ");
        System.out.println("   manchester united is also known as red devil   ");
        res=VowelsCount.vowelcount("   manchester united is also known as red devil ");
        System.out.println("The number of vowels in the string is  :" + res);
    }
}
/*
if the original string : " Alive is awesome "
then the number of vowels is : 8
*/
