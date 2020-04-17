package advJava;
import java.util.*;
public class LinkedListDemo {
	public static void main(String a[])
	{
		LinkedList<String> list = new LinkedList<String>();
		list.add("A"); // add element at the end
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println(list);
		
		Iterator<String> iter = list.iterator();
		
		iter.next(); //iterate to A
		iter.next(); //iterate to B
		iter.remove(); // delete B 
		iter.next();   //iterate to C
		System.out.println(list.contains("A"));
		System.out.println(list);
		ListIterator<String> litr= list.listIterator();
		litr.add("G");
		litr.next();
		litr.next();
		System.out.println(list);
		
		litr.previous();
		
		litr.add("H");
		System.out.println(list);
		litr.next();
		litr.next();
		litr.remove();
		System.out.println(list);
		
	}
}

/*
[A, B, C, D]
false
[C, D]
[G, C, D]
[G, C, H, D]

*/
