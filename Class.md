# Class
A class is a user defined blueprint or prototype from which objects are created. It represents the set of properties or methods that are common to all objects of one type.

# Object
It is a block that contain all information of its class.


## Declaration of objects
```
ClassIdentifier ObjectIdentifier;
```
For example;
This statement creates a physical object in the heap with reference variable 'stu1' pointing to object in stack.
```
    class Student{
        // body of class
    }
    
    Student  stu1 =  new Student();
```
Declaration of reference variable/Object variable
```
Student stu1 --> NULL
```
Defination of object
```
Student  stu1 =  new Student();
```

**EXAMPLE**
```
import java.util.Scanner;


class Student{
	
	Scanner sc = new Scanner(System.in);
	
	String name;
	int sapid;
	String subject;
	int year;
	
	void input() {
		System.out.println("Enter Name, SapId, Subject and Year");
		name = sc.nextLine();
		sapid = sc.nextInt();String nam = sc.nextLine();
		String subject = sc.nextLine();
		year = sc.nextInt();
		System.out.println("Name = "+name+"\nSapId = "+sapid+"\nSubject = "+subject+"\nYear = "+year);
	}
}

public class Class {	
	public static void main(String [] args) {
		Student stu1 = new Student();
		stu1.input();
		
	}
}
```
Here in this example we have used nextLine one time extra as after reading nextLine and taking input if we put **ENTER** the next nextLine take input as enter ans so we need one extra nextLine to take ENTER as input. 


## Assigning one abject to another
```
import java.util.Scanner;

class Student1{
	
	Scanner sc = new Scanner(System.in);
	
	String name;
	int sapid;
	String subject;
	int year;
	
	void input() {
		System.out.println("Enter Name, SapId, Subject and Year");
		name = sc.nextLine();
		sapid = sc.nextInt();
		String nam = sc.nextLine();
		subject = sc.nextLine();
		year = sc.nextInt();
	}
	void print() {
		System.out.println("Name = "+name+"\nSapId = "+sapid+"\nSubject = "+subject+"\nYear = "+year);
	}

}

public class AssignOneOjectToAnother {
	public static void main(String [] args) {
		Student1 stu1 = new Student1();
		stu1.input();
		stu1.print();
	
		Student1 stu2 = new Student1();
		stu2=stu1; 
		stu2.print();
		
	}
}
```
**stu2 = stu1**


## Constuctor
Constructor is a block of codes similar Class,a special type of method which is used to initialize the object. At the time of calling constructor, memory for the object is allocated in the memory.
Every time an object is created using the new() keyword, at least one ()Default Constructor is called. 
```
import java.util.Scanner;

class Add1{
	Add1(int a,int b,int c){
		System.out.println(a+b+c);
	}
	
	Add1(int a, int b) {
		System.out.println(a+b);
	}
	
	Add1() {
		System.out.println("Nothing Passed");
	}
	
}

public class  New {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		Add1 num1 = new Add1(a,b,c);
		Add1 num2 = new Add1(a,b);
	}
}
```
