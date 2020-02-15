import java.util.Scanner;
public class StubMethod {
	public static void main(String [] args) {
		Circle c1 = new Circle();
		
		c1.getDimensions();
	}
}

interface constant{ // interface can be used to keep values constant
	final double pi = 3.14;
	void getDimensions();
	double getlength();
	void getWidth();
}

class Circle implements constant{
	Scanner sc = new Scanner(System.in);
	
	int radius= sc.nextInt();
	double circumference = 2*pi*radius;
	int diameter = 2*radius;
	
	// STUB METHODS double getlength and getWidth as we do not work with rectangle so we do not need length and width
	public double getlength(){
		return 0;
	}
	public void getWidth() {
		
	}
	
	public void getDimensions(){
		System.out.println("Diameter is "+diameter );
		System.out.println("Circumference is "+circumference );
	}
}
