import java.util.Scanner;
public class TrunkCalls {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ordinary c1 = new ordinary();
		urgent c2 = new urgent();
		lightening c3 = new lightening();
		
		c1.getInfo();
		c2.getInfo();
		c3.getInfo();
	}

}

class trunk {
	int duration;
	Scanner sc = new Scanner(System.in);
	
	void getInfo() {
		System.out.println("Enter Duration of call:");
		duration = sc.nextInt();
		
	}
}

class urgent extends trunk{
	void getInfo() {
		System.out.println("Enter Duration of call(urgent):");
		duration = sc.nextInt();	
		
		int ur = 16;
		System.out.println("Your Cost is "+ur*duration);
	}
}

class lightening extends trunk{
	int li = 64;
	void getInfo() {
		System.out.println("Enter Duration of call(lightening):");
		duration = sc.nextInt();	
		
		System.out.println("Your Cost is "+ li*duration);
	}
}

class ordinary extends trunk{
	int or = 8;
	void getInfo() {
		System.out.println("Enter Duration of call(ordinary):");
		duration = sc.nextInt();	
		
		int ur = 16;
		System.out.println("Your Cost is "+ or*duration);
	}
}
