package wrapper;

public class convertFloat {
	public static void main(String [] args) {
		convertF f1 = new convertF();
		f1.Convert();
	}
}

class convertF{
	
	void Convert() {
			
		float f1 = 10.56f;
		System.out.println("float f1 = "+f1);
	    Float f2 = new Float(f1);    				// float to Float
	    System.out.println("Float f2 = "+f2);	
	    String f3 = Float.toString(f2);				// Float to String
		System.out.println("String f3 = "+f3);		
		float f4 = Float.parseFloat(f3);			// String to float
		System.out.println("float f4 = "+f4);
		String f5 = String.valueOf(f4); 			// float to String
		System.out.println("String f5 = "+f5);
		Float f6 = Float.parseFloat(f3);			// String to Float
		System.out.println("Float f6 = "+f6);
		float f7 = f6.floatValue();    				// Float to float
	    System.out.println("float f7 = "+f7);
	}
}
