package random;


class Alpha 
{ 
	public String type = "a "; 							 
	public Alpha() { System.out.print("alpha "); } 		// 1
} 

public class a23 extends Alpha 
{ 
	public a23() { System.out.print("beta "); } 		// 2

	void go() 
	{ 
		type = "b "; 
		System.out.print(this.type + super.type); 		// 3
	} 

	public static void main(String[] args) 
	{ 
		new a23().go(); 
	} 
} 
