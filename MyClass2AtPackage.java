// inputing the user defined package and already defined package

package pkg2;
import java.util.Scanner;

public class MyClass2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		methods obj = new methods();
		int a = sc.nextInt();   
		int b = sc.nextInt();
		int sum = obj.sum( a, b);
		System.out.println(sum);
		sc.close();
	
}
