//What will be the output of the following Java code snippet?

public class Test 
{
	public static void main(String[] args) 
        {
		Set s = new HashSet();
		s.add(new Long(10));
		s.add(new Integer(10));
		for(Object object : s)
                {
		    System.out.println("test - "+object);
		}
	}
}/*
a)

   Test - 10
   Test - 10
b) Test – 10
c) Runtime Exception
d) Compilation Failure
View Answer

Answer: a
Explanation: Integer and Long are two different data types and different objects. So they will be treated as unique elements and not overridden.*/
