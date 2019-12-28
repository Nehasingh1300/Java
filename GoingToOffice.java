import java.util.Scanner;

class TestClass {
    public static void main(String args[] )  {
        Scanner sc = new Scanner(System.in);
        int dist = sc.nextInt();
        int oc = sc.nextInt();
        int of = sc.nextInt();
        int od = sc.nextInt();
        
        int cs = sc.nextInt();
        int cb = sc.nextInt();
        int cm = sc.nextInt();
        int cd = sc.nextInt();
        
        int online,offline;
        online = oc + (dist-of)*od;
        offline = cb + (dist/cs) * cm + (dist *cd);
        if(online > offline){
            System.out.println("Classic Taxi");
        }
        else
            System.out.println("Online Taxi");
    }
}
