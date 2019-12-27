import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
   
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pr=1;
        for( int i=1; i<=n; i++){
            pr = pr * i;
        }
        
        System.out.println(pr);
    }
}
