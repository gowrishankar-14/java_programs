import java.util.*;

public class ArrayList
{
	public static void main(String[] args) 
	{
		ArrayList <String> car=new ArrayList<>(Arrays.asList("BMW","Lambourgini","McLaren"));

	
 		if(car.contains("BMW"))
 		{
 		    System.out.println("Car Found");
 		}
 		else
 		{
 		    System.out.println("Not Found");
 		}
 		for(int i=0;i<2;i++)
 		{
 		System.out.println(i+"th element "+car.get(i));
 		}
		
		car.remove("McLaren");
		System.out.println(car);
	}
}
