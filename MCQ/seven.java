package random;

//filename Main.java 
class Point { 
	protected int x, y; 

	public Point(int _x, int _y) { 
		x = _x; 
		y = _y; 
	} 
} 

public class seven { 
	public static void main(String args[]) { 
	Point p = new Point();                      // as there is user defined parameterized constructor so no default constructor can be called 
	System.out.println("x = " + p.x + ", y = " + p.y); 
	}	 
} 
