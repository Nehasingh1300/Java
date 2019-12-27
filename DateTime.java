import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Calendar;
class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {      
        int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 }; 
        year -= (month < 3) ? 1 : 0; 
        int res= ( year + year/4 - year/100 + year/400 + t[month-1] + day) % 7;
        String s = "Monday";
        switch (res) {
            case 1:{
                s = "MONDAY";
                break;
                //return s;
            }
            case 2:{
                s = "TUESDAY";
                //return s;
                break;
            }
            case 3:{
                s = "WEDNESDAY";
                break;//return s;
                
            }
                
            case 4:{
                s = "THURSDAY";
                //return s;
                break;
            }
                
            case 5:{
                s = "FRIDAY";
                //return s;
                break;
            }
                
            case 6:{
                s = "SATURDAY";
                //return s;
                break;
            }
                
            case 7:{
                s = "SUNDAY";
                //return s;
                break;
            }

            default :{
                s = "SUNDAY";
                //return s;
                break;
            }
        
        } 
        return s;
    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
