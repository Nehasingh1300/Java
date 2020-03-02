package javaAssignment;
import java.util.Scanner;

public class Aanimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.close();
	}

}

abstract class animal {            //class is abstract so methods without defination
	// any number of methods can be abstract atleast one should be abstract
	abstract String getName();     // return animal's name
	abstract int getAge();         // return age of animal
	void talk() {                  // type of animal
		System.out.println("\nCarnivorous Animal");
	}
}

class Tiger extends animal{       //Tiger Class
	Scanner sc;
	
	String getName() {             // abstract method from animal class return name
		String name = sc.nextLine();
		return name;
	}
	
	int getAge() {                 // abstract method from animal class return age
		int age = sc.nextInt();
		return age;
	}
	
	void talk() {                  // type of animal, display name and age
		System.out.println("Name "+this.getName());
		System.out.println("Age "+this.getAge());
		System.out.println("\nCarnivorous Animal");
	}
}

class Lion extends animal{         // Lion class
	Scanner sc;
	
	String getName() {             // abstract method from animal class return name
		String name = sc.nextLine();
		return name;
	}
	
	int getAge() {                 // abstract method from animal class return age
		int age = sc.nextInt();
		return age;
	}
	
	void talk() {                  // type of animal, display name and age
		System.out.println("Name "+this.getName());
		System.out.println("Age "+this.getAge());
		System.out.println("\nCarnivorous Animal");
	}
}

class Rhino extends animal{        // Rhino Class
	Scanner sc;
	
	String getName() {             // abstract method from animal class return name
		String name = sc.nextLine();
		return name;
	}
	
	int getAge() {                 // abstract method from animal class return age
		int age = sc.nextInt();
		return age;
	}
	
	void talk() {                  // type of animal, display name and age
		System.out.println("Name "+this.getName());
		System.out.println("Age "+this.getAge());
		System.out.println("\nCarnivorous Animal");
	}
}

class zoo{
	
	void addAnimal(animal newAnimal){
		newAnimal =  
	}
}
