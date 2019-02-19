
import java.lang.*;
public class SimpleTh extends Thread
{
	public void run()
	{
		System.out.println("run method");
	}
	public static void main(String[] args)
	{
		ThreadDemo t1=new ThreadDemo();
		System.out.println("t1 thread priority"+t1.getPriority());
	}
	
}