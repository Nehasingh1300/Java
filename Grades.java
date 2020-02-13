/*
6)	Write a program to accept 10 student’s marks in an array, arrange it into ascending order, convert into the following grades and print marks and grades in the tabular form.
Between 40 and 50 : PASS 
Between 51 and 75 : MERIT 
 	and above : DISTINCTION
*/
import java.util.Scanner;

public class Grades {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student[] s = new Student[7];
		
		for(int i = 0 ; i<10 ; i++) {
			s[i] = new Student();
			s[i].getMarksGrade();
		}
		
			for (int i = 0; i < 10; i++) 
		    {
				for (int j = i + 1; j < 10; j++) { 
					if (s[i].marks > s[j].marks){
						int temp = s[i].marks;
		                s[i].marks = s[j].marks;
		                s[j].marks = temp;
		            }
		         }
		    }
	}
}

class Student{
	int marks;
	String grade;
	
	Scanner sc = new Scanner(System.in);
		
	void getMarksGrade() {
		System.out.print("Enter your marks: ");
		int marks = sc.nextInt();
		System.out.println(marks);
	
		System.out.print("\nYour Grade: ");
		if(marks>=40 && marks<=50) {
			grade="PASS";
			System.out.println(grade);
		}
		else if (marks>=51 && marks<=75) {
			grade="MERIT";
			System.out.println(grade);
		}
		else if (marks>75) {
			grade="DISTINCTION";
			System.out.println(grade);
		}
		else
			System.out.println("No");
		
	}
}
