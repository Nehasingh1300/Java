import java.util.Scanner;

public class SquareADD {
	public static void main(String [] args) {
		int arr[];		
		arr = new int [10];
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<10; i++){
			arr[i]= sc.nextInt();
		}
		
		int arrS[];		
		arrS = new int [10];
		for(int i=0; i<10; i++){
			arrS[i]= arr[i]*arr[i];
		}
		
		for(int i=0; i<10; i++) {
			sum = sum + arrS[i];
		}
		
		
		System.out.println(sum);	
	}
}
