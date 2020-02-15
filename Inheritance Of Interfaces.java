
public class InheritanceOfInterfaces {

	public static void main(String[] args) {
		ABC  abc = new ABC();
		ABC.getinfo();
	}

}

interface A1{
	String statea = "A";
}

interface B{
	String stateb = "B";
}

interface C extends A1, B{
	String statec = "C";
}

class ABC implements C{
	static void getinfo(){
		System.out.println(C.statea);
		System.out.println(C.stateb);
		System.out.println(C.statec);
	}
}
