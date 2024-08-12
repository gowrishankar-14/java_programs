import java.util.Scanner;
public class FoodPrice
{
	public static void main(String[] args) 
	{
	    System.out.println("1.Chicken Briyani 2.Mutton Briyani 3.Fish Fry 4.Hyderabad Briyani 5.Kothu Parotta 6.Full Grill 7.Chicken Rice");
	    Scanner s=new Scanner(System.in);
	    int op=s.nextInt();
	    
	    switch(op)
	    {
	        case 1:
	       {
	            System.out.println("Chicken Briyani Costs Rs.100");
	            break;
	       }
	       case 2:
	       {
	           System.out.println("Mutton Briyani Costs Rs.240");
	           break;
	       }
	       case 3:
	       {
	           System.out.println("Fish Fry Costs Rs.60");
	           break;
	       }
	       case 4:
	       {
	           System.out.println("Hyderabad Briyani Costs Rs.110");
	           break;
	       }
	       case 5:
	       {
	           System.out.println("Kothu Parotta Costs Rs.80");
	           break;
	       }
	       case 6:
	       {
	           System.out.println("Full Grill Costs Rs.360");
	           break;
	       }
	       case 7:
	       {
	           System.out.println("Chicken Rice Costs Rs.90");
	           break;
	       }
	       default:
	       {
	           System.out.println("Selection Required");
	           break;
	       }
	   }
	       
    }
}
