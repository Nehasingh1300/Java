# Static Keyword 
  
Stores the value of literal and on every change in value it upgrades it

```
public class  Static1{
	
	static int count = 0; // static variable; initializing count to 0
	int id; // instance variable
	
	public Static1() {
		// every time constructor runs, it increments count
		count = count +  1;
		
		id = count;
	}
	public int getId() {
		return id;
		
	}
}
	class Application{
		public static void main (String args[]) {
			Static1 obj = new Static1();
			Static1 obj1 = new Static1();
			System.out.println("Customer ID number : "+obj.getId());
			System.out.println("Customer ID number : "+obj1.getId());
		}
	}
```
## Output
```
Customer ID number : 1
Customer ID number : 2
```

# Without Static Keyword
```
public class  Static1{
	
	int count = 0; // without static variable; initializing count to 0
	int id; // instance variable
	
	public Static1() {
		// every time constructor runs, it increments count
		count = count +  1;
		
		id = count;
	}
	public int getId() {
		return id;
		
	}
}
	class Application{
		public static void main (String args[]) {
			Static1 obj = new Static1();
			Static1 obj1 = new Static1();
			System.out.println("Customer ID number : "+obj.getId());
			System.out.println("Customer ID number : "+obj1.getId());
		}
	}
```
## Output
```
Customer ID number : 1
Customer ID number : 1
```

# Static Method 
There is no need to call its object for calling its method. A static method can be called without making object.
