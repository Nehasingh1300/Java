import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();                      //Taking input 
    int count = 0;                               // Set count to check for prime 
    
    for( int i=2; i<num/2; i++){                 // loop for traversing all numbers
      if(num%i == 0){                            // check if number is divisible by any other number
        System.out.println("NOT PRIME");         // print not prime
        count++;                                 // increment count so that prime condition is not satisfied
        break;                                   // break the program so that no more excution takes place
      }
    }
    if(count == 0){                              // if count is 0 print prime
      System.out.println("PRIME");            
    }
}
}
