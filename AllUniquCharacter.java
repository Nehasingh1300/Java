import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class uniquechar {
    
    public static void main (String args[])
    {
        boolean result=false;
        String inputstring="Alve iwsom";
        System.out.println(inputstring);
        HashSet < Character> uniquecharset= new HashSet();
        for(int i=0;i < inputstring.length();i++)
        {
            result=uniquecharset.add(inputstring.charAt(i));  // it returns false if any duplicate word is added
            if (result == false)
            break;
        }
    System.out.println(result); }
}

/*
Alve iwsom
true
*/
