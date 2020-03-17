package random;
class first1 
{ 
	int i = 10; 

	public first1(int j) 
	{ 
		System.out.println(i+"in first"); // 1
		this.i = j * 10; 
		System.out.println(i+"in first"); // 2
	} 
} 

class second1 extends first1 
{ 
	public second1(int j) 
	{ 
		super(j); 
		System.out.println(i+"in second"); // 3
		this.i = j * 20; 
	} 
} 

public class nineteen 
{ 
	public static void main(String[] args) 
	{ 
		second1 n = new second1(20); 
		System.out.println(n.i); 
	} 
} 
