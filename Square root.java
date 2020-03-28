import java.util.Scanner;
public class HelloWorld{

     public static void main(String []args){
        System.out.print("Number : ");
        
        Scanner sc = new Scanner();
        int num = sc.nextInt();
        
        int sqrt = Math.sqrt(num);
        System.out.println("Square root : "+sqrt);
        }

}
