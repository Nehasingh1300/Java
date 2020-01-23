public class Circle {  
   private double radius;
   private String color;
   
   public Circle() {
      radius = 1.0;
      color = "red";
   }
   
   public Circle(double r) {
      radius = r;
      color = "red";
   }
   
   public double getRadius() {
     return radius; 
   }
   public double getArea() {
      return radius*radius*Math.PI;
   }
}

public class TestCircle {  // Save as "TestCircle.java"
   public static void main(String[] args) {
      
      Circle c1 = new Circle();  
      System.out.println("The circle has radius of " 
         + c1.getRadius() + " and area of " + c1.getArea());
      
      Circle c2 = new Circle(2.0);
      System.out.println("The circle has radius of " 
         + c2.getRadius() + " and area of " + c2.getArea());
   }
}