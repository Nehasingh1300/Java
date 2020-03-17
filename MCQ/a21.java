package random;

public class a21 {
	int num = 100; 
	public void calc(int num) { this.num = num * 10; }    // num=2
	public void printNum()	 { System.out.println(num); } // num=20

	public static void main(String[] args) 
	{ 
		a21 obj = new a21(); 
		obj.calc(2);  // control goes here 
		obj.printNum(); 
	} 
} 
