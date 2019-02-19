import java.util.*;
public class Quiz {

	public static void main(String[] args) {


  
System.out.println(multiply(2,3));
	}
	  
	  public static int multiply(int x, int y) {
		  if(y==0)
		  {  return 0;
		  }
		  else
		  {
			  return (x+multiply(x,y-1));
		  }
	
		 
	  }
}
