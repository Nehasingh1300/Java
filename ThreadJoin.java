package thread;

public class Join  extends Thread{  
	 public void run(){  
	  for(int i=1;i<=5;i++){  
	   try{  
	    Thread.sleep(500);    //sleep do this t2 & t3 will execute simultaneously
	   }catch(Exception e){System.out.println(e);}  
	  System.out.println(i);  
	  }  
	 }  
	public static void main(String args[]){  
	 Join t1=new Join();  
	 Join t2=new Join();  
	 Join t3=new Join();  
	 t1.start();     
	 try{         
	  t1.join();       // t1 is executed completely first and then t2 and t3 will work
	 }catch(Exception e){System.out.println(e);}  
	  
	 t2.start();  
	 t3.start();  
	 }  
	}  
/*
1
2
3
4
5
1  sleep do this t2 & t3 will execute simultaneously
1
2
2
3
3
4
4
5
5*/
