import java.util.*;
public class SupressWarning {
	
@SuppressWarnings("unchecked")
    static void main(String args[]){  
	ArrayList list=new ArrayList();  
	list.add("sonoo");  
	list.add("vimal");  
	list.add("ratan");  
	  
	for(Object obj:list)  
	System.out.println(obj);  
	  
	}
} 
