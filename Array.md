# Array 

## Declaration
type Identifier [];

## Initialisation
int numbers [] = { 1, 2, 3, 4};

## Number of elements in array
arrayName.length;

## Assigning one array to another
array1 = array2;
Both array should be of same data type, here array2 is another reference to same array elements.

```
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class AddingItemsDynamically
{
        public static void main(String args[])
        {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the size of the array :: ");
                int size = sc.nextInt();
                
                String myArray[] = new String[size];
                System.out.println("Enter elements of the array (Strings) :: ");
                for(int i=0; i<size; i++)
                {
                        myArray[i] = sc.next();
                }
                System.out.println(Arrays.toString(myArray));
                ArrayList<String> myList = new ArrayList<String>(Arrays.asList(myArray));
                System.out.println("Enter the element that is to be added:");
                String element = sc.next();
                myList.add(element);
                myArray = myList.toArray(myArray);
                System.out.println(Arrays.toString(myArray));
        }
}


```
