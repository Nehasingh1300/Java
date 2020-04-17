package advJava;
/*
 * The Properties class represents a persistent set of properties. The Properties can be saved to a stream or loaded from a stream.

Properties is a subclass of Hashtable.
It is used to maintain list of value in which the key is a string and the value is also a string.
One useful capability of the Properties class is that you can specify a default property that will be returned if no value is associated with a certain key.
Multiple thread can share a single properties object without the need of external synchronisation.
 */

import java.util.*;

public class PropertiesDemo
{

   public static void main(String[] args)
   {
     Properties pr = new Properties();
     pr.put("Java", "James Ghosling"); 
     pr.put("C++", "Bjarne Stroustrup");
     pr.put("C", "Dennis Ritchie");
     pr.put("C#", "Microsoft Inc.");
     Set< ?> creator = pr.keySet();

     for(Object ob: creator)
     {
         System.out.println(ob+" was created by "+ pr.getProperty((String)ob) );
     }

   }

}
