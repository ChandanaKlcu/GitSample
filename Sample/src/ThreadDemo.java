import java.lang.*;
public class ThreadDemo extends Thread
{
	public void run()
	{
		System.out.println("run method");
	}
	public static void main(String[] args)
	{
		ThreadDemo t1=new ThreadDemo();
		ThreadDemo t2=new ThreadDemo();
	    ThreadDemo t3=new ThreadDemo();
	    
	    t1.setPriority(1);
	    t2.setPriority(10);
	    t3.setPriority(5);
	System.out.println("t1 thread priority"+t1.getPriority());
	System.out.println("t2 thread priority"+t2.getPriority());
	System.out.println("t3 thread priority"+t3.getPriority());
	
	}
	}
