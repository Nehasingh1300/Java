package advJava;

public class GenericClass<T> {
	T member;
	public void setMember(T value) {
		member = value;
	}
	public T getMember() {
		return member;
	}
	public static void main(String arg[]) {
		GenericClass<Integer> ob1 = new GenericClass<Integer>();
		ob1.setMember(10);
		System.out.println("Member is:"+ob1.getMember());
		GenericClass<Double> ob2 = new GenericClass<Double>();
		ob2.setMember(20.55);
		System.out.println("Member is:"+ob2.getMember());
		GenericClass<String> ob3 = new GenericClass<String>();
		ob3.setMember("OSOS");
		System.out.println("Sum is:"+ob3.getMember());
	}
}	
/*
Member is:10
Member is:20.55
Sum is:OSOS
*/
