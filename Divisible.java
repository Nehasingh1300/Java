import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		// declaring scanner class
		Scanner sc = new Scanner(System.in);
		
		//declaring sum integer, which store sum
		int sum=0;
		
		//Declaring array
		int arr[];		
		arr = new int [10];
		
		// taking input of values
		for(int i=0; i<10; i++) {
			arr[i]= sc.nextInt();
		}
		
		// sum of ll numbers larger than 40 and less then 250
		for(int i=0; i<10; i++) {
			if(arr[i]>40 && arr[i]<250) {
				if(arr[i]%5==0) {
					sum = sum + arr[i];
				}
			}
		}
		
		System.out.println(sum);
	}

}
