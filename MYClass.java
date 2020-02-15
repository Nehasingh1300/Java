// giving error in eclipse but not in online compiler
public class MYCLASS {

	public static void main(String[] args) {
		MyClass c1 = new MyClass();
		MyClass c2 = new MyClass();

		c1.meth1();
		c2.meth2();
	}

}

interface AB{
	void meth1();
	void meth2();
}

class MyClass implements AB{
	public void meth1() {
		System.out.println("Inside meth1");
	}
	
	public void meth2() {
		System.out.println("Inside meth2");
	}
}
