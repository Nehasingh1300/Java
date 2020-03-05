package Exception;
import java.util.Scanner;

public class studentArray { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student stu[]= new student[10];  // object array with size 10
		
		try {   
			for(int i=0 ; i<34; i++) {   // if size go greater than 10 then  throw exception 
				stu[i]= new student();
				stu[i].get();
			}
		}
		
		catch(ArrayIndexOutOfBoundsException e)   // give exception when array go beyond 10 
		{
			System.out.println("Do not go out of Array Bound");
		}
	}
}

class student{
	String name;
	int rollnumber;
	Scanner sc = new Scanner(System.in);
	
	void get() {
		System.out.print("Enter name: ");
		name = sc.nextLine();
		System.out.print("Enter roll number: ");
		rollnumber = sc.nextInt();
	}
}
