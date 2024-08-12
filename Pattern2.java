import java.util.*;

public class Pattern2
{
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter Number Of *'s:");
		int n=s.nextInt();
		
		for(int i=n;i>0;i--)
		{
		    for(int j=i;j>0;j--)
		    {
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}
