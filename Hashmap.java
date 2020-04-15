package advJava;
import java.util.*;
public class MapDemo {
	public static void main(String args[]) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("Name", "Neha");
		map.put("Address", "Gurugram");
		map.put("Designation", "Student");
		System.out.println(map);
		
		System.out.println(map.size());  // Give the number of elements in map
		Set<Map.Entry<String, String>> e =map.entrySet(); // returns a set having same elements as the hash map
		System.out.println(e);
		Map<String,String> sortedmap = new TreeMap<String,String>(map); //sorted based on its keys here with address,name,designation
		System.out.println(sortedmap);
		Collection<String> values = map.values(); //store and manipulate the group of objects
		System.out.println(values);
		System.out.println(map.get("Name")); // getting particular values
		Set<String> keys = map.keySet(); // provides key set elements
		System.out.println(keys);
		System.out.println(map.containsKey("Name"));  //check whether a key exist or not  
		System.out.println(map.containsValue("XYZ")); // if yes send true else false
		map.remove("Name");  // remove key
		System.out.println(map.containsValue("XYZ"));
		for(Map.Entry<String, String> ele:e) {   // display elements in hashmap
			System.out.println(ele);
		}
	}
}
