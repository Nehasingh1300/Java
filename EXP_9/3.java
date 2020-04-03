package thread;

public class Thread10 
{
	public static void main(String arg[])throws Exception
	{
		data d1=new data();
		data d2=new data();
		data d3=new data();
		data d4=new data();
		data d5=new data();
		data d6=new data();
		data d7=new data();
		data d8=new data();
		data d9=new data();
		data d10=new data();
		
	}
}

class item { static int count=0; }
class data extends item implements Runnable
{
	item d=this;
	Thread t;
	data()
	{
		t=new Thread(this);
		
		t.start();
	}
	public void run()
		{ d=syn.increment(d,t); }
}

class syn
{
	synchronized static item increment(item i,Thread t)
	{
	i.count++;
	System.out.println(t.getName());
	System.out.println(i.count);
	return(i);
	}
}
