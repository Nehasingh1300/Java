/*The ArrayList class is a resizable array, which can be found in the java.util package.

The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to
add or remove elements to/from an array, you have to create a new one). While elements can be added and removed from an ArrayList
whenever you want. 
*/

package advJava;

import java.util.*;
public class ArrayListDemo {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(2,5);     //adding 5 in 2nd position
		System.out.println(list);
		
		Iterator<Integer> itr= list.iterator();
		int i=0;
		
		while(itr.hasNext()) {   // checks is next element is present or not using hasNext()
			list.set(i, list.get(i)+1); // get access index ; set updates element value 
			itr.next();  // itr.next() accesses next element 
			i++;    // i++ increment index
		}
		
		System.out.println(list);
		
		for(Integer e:list) {
			System.out.println("List Element: "+e);
		}
	}
}
