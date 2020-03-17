package random;

class Base { 
	protected void foo() {} 
} 
class Derived extends Base { 
	void foo() {}  			//  Cannot reduce the visibility of the inherited method from Base
} 
public class twelve  { 
	public static void main(String args[]) { 
		Derived d = new Derived(); 
		d.foo(); 
	} 
} 
