import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class ArrayLargestValue {
    
    public static void main(String[] args) {
        Integer[] arr = {33, 34, 112, 14, 23};
        List&lt;Integer&gt; b = Arrays.asList(arr);
        System.out.println(Collections.max(b));
    }
}
