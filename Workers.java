import java.util.Scanner;

public class Workers {
	public static void main(String [] args) {
		
		DailyWorker w1 = new DailyWorker();
		SalariedWorker w2 = new SalariedWorker();
				
		w1.compPay();
		w2.compPay();
		
	}
}

class Worker {
		// name of worker
		String name;
		
		// Salary rate of every worker
		int payRate;
		
		
		Scanner sc = new Scanner(System.in);
		int compHour;
		
		// To compute week pay of every worker
		void compPay(){ 
			System.out.println("Input your Name:");
			name = sc.nextLine();
			
			System.out.println("Input your Pay Rate:");
			payRate = sc.nextInt();
		}
		
	
				
}

class DailyWorker extends Worker{
	void compPay() {
		System.out.println("Input your Name:");
		name = sc.nextLine();
		
		System.out.println("Input your Pay Rate:");
		payRate = sc.nextInt();
		
		System.out.println("Input your Work Hours:");
		int hoursOfWork = sc.nextInt();
		
		System.out.println("Your Daily Wages are "+ hoursOfWork*payRate);
	}
	
}

class SalariedWorker extends Worker{
	void compPay() {	
		System.out.println("Input your Name:");
		name = sc.nextLine();
		
		System.out.println("Input your Pay Rate:");
		payRate = sc.nextInt();
		
		System.out.println("Your Salary is "+ 40*payRate);
	}
}



