package String;

public class StringBufferMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer s = new StringBuffer("NehaSingh");
		System.out.println("String Length : "+s.length());   // length method
		System.out.println("String Capacity : "+s.capacity());   // capacity method
		s.append("BtechCSEDevops");   //append
		System.out.println(s);  
		s.insert(23, "6396050579");   //insert
		System.out.println(s);
		s.reverse();    //reverse
		System.out.println(s);
		s.reverse();
		s.delete(4, 10);  //delete
		System.out.println(s);
		s.replace(4, 17, "DevOps");   //replace
		System.out.println(s);
	}

}
