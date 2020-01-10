import java.util.Scanner;

public class Main   //file name should be Main.java
{
	public static void main(String[] args) {
	 
	    Scanner sc = new Scanner(System.in);
	    int sec = sc.nextInt();
	    
      int h = (sec/3600);                       //calculating hours by dividing by 3600
	    int m = (sec -(3600*h))/60;               //calculating minutes by subtracting hours and then divide by 3600
	    int s = (sec -(3600*h)-(m*60));           //calculating  seconds by subtrating hours and minutes
	    
      System.out.println(h+":"+m+":"+s);        //Printing the output
	}
}
