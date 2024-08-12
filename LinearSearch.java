import java.util.*;
public class LinearSearch
{
	public static void main(String[] args) {
	    
	    Scanner s=new Scanner(System.in);
	    
	    String []arr = {"hari","John","Gowtham","Dharsan","jai"};
	    // Scanner s=new Scanner(System.in);
	    System.out.print("Enter Your Target Value:");
	    String target=s.nextLine();
	    int c=0;
	    
	    for(int i=0;i<5;i++)
	    {
	        if(target.equals(arr[i]))
	        {
	            c=1;
	            break;
	        }
	       
	    }
	        switch(c) {
	            case 1:
	                {
	                    System.out.println("Target found");
	                    break;
	                }
	                case 0:
	                    {
	                    System.out.println("Target not found");
	                    break;
	                    }
	        }
	}
}
