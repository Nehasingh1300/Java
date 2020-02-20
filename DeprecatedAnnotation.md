// method should no longer be used as it may have new version in future or is not of any use now!
public class Deprecated {
	  
	void m(){System.out.println("hello m");}  
	  
		@Deprecated  
		void n(){
			System.out.println("hello n");
		}  
	}  
	  
	class TestAnnotation3{  
		public static void main(String args[]){  
		  
		A a=new A();  
		a.n();	  
		}	
	}  
