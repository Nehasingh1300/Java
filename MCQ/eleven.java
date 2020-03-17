package random;
//filename: Test2.java 
class Test1 { 
	Test1(int x) { 
		System.out.println("Constructor called " + x); 
	} 
} 

//This class contains an instance of Test1 
class eleven {	 
	eleven(int i) { t1 = new Test1(i); } 
	Test1 t1 = new Test1(10);             // local variable is given preference as compared to constructorized variable

	public static void main(String[] args) {	 
		eleven t2 = new eleven(5); 
	} 
} 
