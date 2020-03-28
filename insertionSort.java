import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class InsertionSort {
    
    
    public static int[] insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int next = list[i];
            // find the insertion location while moving all larger element up
            int j = i;
            while (j > 0 && list[j - 1] > next) {
                list[j] = list[j - 1];
                j--;
            }
            // insert the element
            list[j] = next;
        }
        return list;
    }
    
    
    
    public static void main(String args[]) throws Exception
    {
        String list="";
        int i=0,n=0;
        
        InsertionSort s= new InsertionSort();
        ArrayList<Integer> arrlist=new ArrayList<Integer>();
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Please enter the list of elements,one element per line");
        System.out.println(" write 'STOP' when list is completed ");
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        while(!(list=bf.readLine()).equalsIgnoreCase("stop")){
            int intelement=Integer.parseInt(list);
            arrlist.add(intelement);
            
        }
        
        int elementlist[]  = new int[arrlist.size()];
        Iterator<Integer> iter = arrlist.iterator();
        for (int j=0;iter.hasNext();j++) {
            elementlist[j] = iter.next();
        }
        
        elementlist=insertionSort(elementlist);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Values after Insertion Sort : ");
        for (int j=0;j<elementlist.length;j++) {
            System.out.println(elementlist[j]+" ");
        }
    }
}
