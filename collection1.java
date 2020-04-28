[23:44, 03/04/2020] Harivansh: 		Set<Integer> keys = h.keySet();
		for(Integer key: keys) {
			System.out.println(key…
[23:44, 03/04/2020] Harivansh: import java.util.*;

public class Collections1 {
	public static void main(String args[]) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(12);
		l.add(23);
		l.add(45);
		l.add(56);
		l.add(31);
		
		Iterator<Integer> itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()); //Iterating ArrayList
		}
		
		ArrayList<Integer> copyobj = (ArrayList<Integer>) l.clone(); //Creating duplicate object
		System.out.println("Cloned ArrayList: "+ copyobj);
		
		Collections.reverse(l); //Reversing ArrayList
		System.out.println("After reversing");
		for(Integer p : l) {
			System.out.println(p);
		}
	}
}
