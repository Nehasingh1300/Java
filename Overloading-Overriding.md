# Overloading
Method Overloading is a feature that allows a class to have more than one method having the same name, if their argument lists are different. 
**EXAMPLE**
```
import java.util.Scanner;
class Overloading1 {
	
		void Add1(int a,int b,int c){
			System.out.println(a+b+c);
		}
		
		void Add1(int a, int b) {
			System.out.println(a+b);
		}
		
		void Add1() {
			System.out.println("Nothing Passed");
		}
		
}

public class Overloading {
	public static void main(String [] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter three numbers");
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			Overloading1 num1 = new Overloading1();
			Overloading1 num2 = new Overloading1();
			
			num1.Add1(a,b);
			num1.Add1(a,b,c);
		}
}
```

# Overridding
If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
**If a subclass provides the specific implementation of the method that has been declared by one of its parent class**, it is known as method overriding.

**Usage of Java Method Overriding**
Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
Method overriding is used for runtime polymorphism

**Rules for Java Method Overriding**
The method must have the same name as in the parent class
The method must have the same parameter as in the parent class.
There must be an IS-A relationship (inheritance).

**Example**
```
class father{
	void role() {
	System.out.println("Father");
	}
}

public class Overriding extends father {
	void role(){
		System.out.println("Son");
	}
	public static void main(String [] args) {
		Overriding fat = new Overriding();
		fat.role();
	}
}
```
