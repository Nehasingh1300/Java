package thread;

public class GetName1  {  
public static void main(String[] args) {  
    GetName1 obj = new GetName1();  
    Class Class1 = obj.getClass();  
    String nm = Class1.getName();  
    System.out.println(" The Class Name = " +nm);  
 }  
}
/* The Class Name = thread.GetName1 */
