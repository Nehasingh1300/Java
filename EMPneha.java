import java.util.Scanner;

public class EMPneha {

	public static void main(String[] args) {
		employee e1 = new employee();
		
		e1.getName();
		e1.getSalary();
		int increSal = e1.IncreaseSalary();
		
		System.out.println(increSal);
		
		Manager m1 = new Manager();
		m1.getDepartment();
	}

}

class employee{
	String name;
	int empid;
	int salary;
	
	// scanner class for taking input
	Scanner sc = new  Scanner(System.in);
	
	employee(){
		
	}
	
	employee(String name, int empid, int salary ){
		
	}
	
	// returns name
	String getName() {
		System.out.print("Enter Your name:");
		name = sc.nextLine();
		return name;
	}
	
	// return salary
	int getSalary() {
		System.out.print("Enter Your salary:");
		salary = sc.nextInt();
		return salary;
	}

	// increase salary by user specified percentage
	int IncreaseSalary() {
		int IncreasedSalary;
		
		System.out.println("Enter the percentage by which increase salary: ");
		int percentage = sc.nextInt();
		
		IncreasedSalary = salary + (salary * percentage /100);
		return IncreasedSalary;
	}

}

class Manager extends employee{
	String department;
	
	String getDepartment() {
		System.out.print("Enter Your Department:");
		department = sc.nextLine();
		return  department;
	}
}
