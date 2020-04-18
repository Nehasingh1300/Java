package advJava;

public class GenericMethodTest {
	   // generic method printArray
	   public static < E > void printArray( E[] inputArray ) {
	      // Display array elements
	      for(E element : inputArray) {
	         System.out.printf("%s ", element);
	      }
	      System.out.println();
	   }

	   public static void main(String args[]) {
	      // Create arrays of Integer, Double and Character
	      Integer[] intArray = { 6,3,9,6 };
	      Double[] doubleArray = { 0.0,5.5,0.0,5.5,7.7,9.9};
	      Character[] charArray = { 'N','E','H','A' };

	      System.out.println("Array integerArray contains:");
	      printArray(intArray);   // pass an Integer array

	      System.out.println("\nArray doubleArray contains:");
	      printArray(doubleArray);   // pass a Double array

	      System.out.println("\nArray characterArray contains:");
	      printArray(charArray);   // pass a Character array
	   }
	}
  /*
Array integerArray contains:
6 3 9 6 

Array doubleArray contains:
0.0 5.5 0.0 5.5 7.7 9.9 

Array characterArray contains:
N E H A 
  */
