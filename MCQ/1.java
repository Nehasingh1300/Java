/*
As default Constructor provides no valus so out is 0 0 
Else as the main and test are in smae package there is no access related problem here if there was some default values then it would have given values
*/
class Test { 
	protected int x, y; 
} 

class Main { 
	public static void main(String args[]) { 
		Test t = new Test(); 
		System.out.println(t.x + " " + t.y); 
	} 
} 
