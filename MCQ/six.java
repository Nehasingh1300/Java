package random;

class six{ 
	public static void DoPrint( Base o ) { 
		o.Print(); 
	} 
	public static void main(String[] args) { 
		Base x = new Base(); 
		Base y = new Derived(); 
		Derived z = new Derived(); 
		DoPrint(x);                 // this directly calls base print() method
		DoPrint(y);                 // it has object of derived class so it call derived class {run time polymorphism}
		DoPrint(z);                 // it directly call derived class print method
	} 
}

class Base { 
	public void Print() { 
		System.out.println("Base"); 
	}		 
} 

class Derived extends Base {	 
	public void Print() { 
		System.out.println("Derived"); 
	} 
} 


