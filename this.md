# [This Keyword](https://www.guru99.com/java-this-keyword.html)
Keyword THIS is a reference variable in Java that refers to the current object.

The various usages of 'THIS' keyword in Java are as follows:
          It can be used to refer **instance variable** of current class
          It can be used to **invoke or initiate current class constructor**
          It can be passed as an **argument** in the method call
          It can be passed as **argument in the constructor call**
          It can be used to **return the current class instance**
   
## Example
```
public class This {
		void display() 
		{ 
			//calling function show() 
			this.show(); 
			System.out.println("Inside display function"); 
		} 
    
		void show() { 
			System.out.println("Inside show funcion"); 
		} 
		
		public static void main(String args[]) { 
			This t1 = new This(); 
			t1.display(); 
		} 
}
```
