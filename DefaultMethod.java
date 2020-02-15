
public class DefaultMethodINTERFACE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA aa = new AA();
		aa.AA();
	}

}

class AA implements A2{
	
}

interface A2{
	default void AA() {
		System.out.println("Method Declaration inside interface");
	}
}
