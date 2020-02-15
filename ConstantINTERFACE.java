import java.util.Scanner;
public class ConstInterface {
	public static void main(String [] args) {
		Circle c1 = new Circle();
		
		c1.getDimensions();
	}
}

interface constant{ // interface can be used to keep values constant
	final double pi = 3.14;
	void getDimensions();
}

class Circle implements constant{
	Scanner sc = new Scanner(System.in);
	
	int radius= sc.nextInt();
	double circumference = 2*pi*radius;
	int diameter = 2*radius;
	
	public void getDimensions(){
		System.out.println("Diameter is "+diameter );
		System.out.println("Circumference is "+circumference );
	}
}
