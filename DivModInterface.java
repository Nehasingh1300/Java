import java.util.Scanner;
public class DivMod {

	public static void main(String[] args) {
		overriden o1 = new overriden();
		o1.div();
		o1.mod();
	}

}

interface twoMethod{
	void div();
	void mod();
}

class overriden implements twoMethod{
	Scanner sc = new Scanner(System.in);
	
	// div method implementing interface twoMethod
	public void div() {
		int num = sc.nextInt();
		int divisor = sc.nextInt();
		System.out.print("Division of "+num+" by  "+divisor+" is "+num/divisor);
	}
	
	// mod method implementing interface twoMethod
	public void mod() {
		int num = sc.nextInt();
		int modulus = sc.nextInt();
		System.out.print("Modulus of "+num+" by  "+modulus+" is "+num%modulus);
	}
}
