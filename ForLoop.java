import java.util.*;
public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        for(int i=1; i<=10; i++){
            int product = N * i;
            System.out.println(N+" x "+i+" = "+product );
        }

        scanner.close();
    }
}
