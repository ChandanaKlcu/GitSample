import java.util.HashSet;
import java.util.Set;
public class HashEx {

	public static void main(String[] args) 
	{
		Set<String> cities =new HashSet<>();
		cities.add("Mysore"); 
		cities.add("Austin");
		cities.add("Cluj");
		cities.add("Atlanta"); 
		cities.add("Buenos");
		
System.out.println("the size of the hashset" + cities.size());

if(cities.contains("las vegas"))
{
	System.out.println("Cities hashset containes las vegas");
}
else
{ 
	System.out.println("Cities hashset doesn't containes las vegas");
}
	}

}
