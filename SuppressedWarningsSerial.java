//annotation tells Java not to display a warning. Without a SuppressWarnings annotation, Java warns you about a missing serialVersionUID field
import java.util.*;
public class SupressWarning {
	
@SuppressWarnings("serial")
    static void main(String args[]){  
	ArrayList list=new ArrayList();  
	list.add("sonoo");  
	list.add("vimal");  
	list.add("ratan");  
	  
	for(Object obj:list)  
	System.out.println(obj);  
	  
	}
} 
